/***************************************************************************
 * Copyright 2016 by HomeDirect - All rights reserved.                *    
 **************************************************************************/
package com.example.web.service.springrestfullwebservices.hello;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

/**
 *  Author: Do Van Khoi
 *  Email: khoi.do@homedirect.com.vn
 *  Feb 22, 2018
 */
@RestController
public class HelloWorldController {
  
  @Autowired
  private MessageSource messageSource;
  
  @GetMapping(path = "hello-world")
  public String hello() {
    return "Hello World";
  }
  
  @GetMapping(path = "hello-world-bean")
  public HelloWorldBean helloBean() {
    return new HelloWorldBean("Hello World");
  }
  
  @GetMapping(path = "hello-world-path-variable/{name}")
  public HelloWorldBean helloBean(@PathVariable String name) {
    return new HelloWorldBean(String.format("Hello World %s", name));
  }
  
  @GetMapping(path = "hello-world-i18n")
  public String helloI18n(@RequestHeader(name = "Accept-Language", required = true) Locale locale) {
    System.out.println("locale: "+ locale);
    return messageSource.getMessage("good.moring.message", null, locale);
  }
}
