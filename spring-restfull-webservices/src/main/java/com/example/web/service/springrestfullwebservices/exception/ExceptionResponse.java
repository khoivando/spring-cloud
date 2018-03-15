/***************************************************************************
 * Copyright 2016 by HomeDirect - All rights reserved.                *    
 **************************************************************************/
package com.example.web.service.springrestfullwebservices.exception;

import java.util.Date;

/**
 *  Author: Do Van Khoi
 *  Email: khoi.do@homedirect.com.vn
 *  Feb 22, 2018
 */
public class ExceptionResponse {
  private Date timestamps;
  private String message;
  private String details;
  public ExceptionResponse() {
    super();
  }
  public ExceptionResponse(Date timestamps, String message, String details) {
    super();
    this.timestamps = timestamps;
    this.message = message;
    this.details = details;
  }
  public Date getTimestamps() {
    return timestamps;
  }
  public void setTimestamps(Date timestamps) {
    this.timestamps = timestamps;
  }
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  public String getDetails() {
    return details;
  }
  public void setDetails(String details) {
    this.details = details;
  }
  
}
