/***************************************************************************
 * Copyright 2016 by HomeDirect - All rights reserved.                *    
 **************************************************************************/
package com.example.micro.service.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *  Author: Do Van Khoi
 *  Email: khoi.do@homedirect.com.vn
 *  Feb 12, 2018
 */
@Component
@ConfigurationProperties("limits-service")
public class Configuration {
  
  private int maximum;
  private int minimum;
  
  public int getMaximum() {
    return maximum;
  }
  public void setMaximum(int maximum) {
    this.maximum = maximum;
  }
  public int getMinimum() {
    return minimum;
  }
  public void setMinimum(int minimum) {
    this.minimum = minimum;
  }
  
}

