/***************************************************************************
 * Copyright 2016 by HomeDirect - All rights reserved.                *    
 **************************************************************************/
package com.example.micro.service.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.micro.service.limitsservice.bean.LimitConfiguration;

/**
 *  Author: Do Van Khoi
 *  Email: khoi.do@homedirect.com.vn
 *  Feb 12, 2018
 */
@RestController
public class LimitController {
  
  private @Autowired Configuration configuration;
  
  @GetMapping("/limits")
  public LimitConfiguration retrieveLimitsFromConfig() {
    return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
  }
  
}
