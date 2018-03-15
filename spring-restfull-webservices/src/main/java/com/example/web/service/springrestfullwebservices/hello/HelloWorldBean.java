/***************************************************************************
 * Copyright 2016 by HomeDirect - All rights reserved.                *    
 **************************************************************************/
package com.example.web.service.springrestfullwebservices.hello;

/**
 *  Author: Do Van Khoi
 *  Email: khoi.do@homedirect.com.vn
 *  Feb 22, 2018
 */
public class HelloWorldBean {
  
  private String message;

  public HelloWorldBean() {
    super();
  }

  public HelloWorldBean(String message) {
    super();
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
  
}
