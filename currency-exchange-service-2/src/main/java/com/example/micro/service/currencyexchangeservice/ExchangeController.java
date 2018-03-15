/***************************************************************************
 * Copyright 2016 by HomeDirect - All rights reserved.                *    
 **************************************************************************/
package com.example.micro.service.currencyexchangeservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *  Author: Do Van Khoi
 *  Email: khoi.do@homedirect.com.vn
 *  Feb 12, 2018
 */
@RestController
public class ExchangeController {
  
  private @Autowired Environment env;
  private @Autowired ExchangeValueRepository repository;
  
  private Logger logger = LoggerFactory.getLogger(getClass());
  
  @GetMapping(value = "/currency-exchange/from/{from}/to/{to}")
  public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
    //ExchangeValue ex = new ExchangeValue(1000l, from, to, BigDecimal.valueOf(65));
    
    logger.info("from: {}, to: {}", from, to);
    
    ExchangeValue ex = repository.findByFromAndTo(from, to);
    ex.setPort(Integer.parseInt(env.getProperty("local.server.port")));
    return ex;
  }
  
}
