/***************************************************************************
 * Copyright 2016 by HomeDirect - All rights reserved.                *    
 **************************************************************************/
package com.example.micro.service.netflixzuulapigatewayserver;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

/**
 *  Author: Do Van Khoi
 *  Email: khoi.do@homedirect.com.vn
 *  Feb 21, 2018
 */
@Component
public class ZuulLoggingFilter extends ZuulFilter {
  
  private Logger logger = LoggerFactory.getLogger(this.getClass());

  public Object run() throws ZuulException {
    HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
    logger.info("request: {} -> uri: {}", request, request.getRequestURI());
    return null;
  }

  public boolean shouldFilter() {
    return true;
  }

  @Override
  public int filterOrder() {
    return 0;
  }

  @Override
  public String filterType() {
    return "pre";
  }

}
