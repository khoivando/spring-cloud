/***************************************************************************
 * Copyright 2016 by HomeDirect - All rights reserved.                *    
 **************************************************************************/
package com.example.micro.service.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *  Author: Do Van Khoi
 *  Email: khoi.do@homedirect.com.vn
 *  Feb 21, 2018
 */
@RestController
public class CurrencyConversionController {
  
  private @Autowired CurrencyExchangeServiceProxy proxy;

  @GetMapping(value = "/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
  public CurrencyConversionBean convertCurrency(@PathVariable String from,
                                                @PathVariable String to,
                                                @PathVariable BigDecimal quantity) {
    
    RestTemplate restTemplate = new RestTemplate();
    Map<String, String> uriVariables = new HashMap<String, String>();
    uriVariables.put("from", from);
    uriVariables.put("to", to);
    String url = "http://localhost:8000/currency-exchange/from/{from}/to/{to}";
    
    ResponseEntity<CurrencyConversionBean> entity = restTemplate.getForEntity(url, CurrencyConversionBean.class, uriVariables);
    CurrencyConversionBean response = entity.getBody();
    
    return new CurrencyConversionBean(response.getId(), from, to, response.getConversionMultiple(), 
        quantity, 
        quantity.multiply(response.getConversionMultiple()), response.getPort());
  }
  
  @GetMapping(value = "/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
  public CurrencyConversionBean convertCurrencyFeign(@PathVariable String from,
                                                @PathVariable String to,
                                                @PathVariable BigDecimal quantity) {
    
    CurrencyConversionBean response = proxy.retrieveExchangeValue(from, to);
    return new CurrencyConversionBean(response.getId(), from, to, response.getConversionMultiple(), 
        quantity, 
        quantity.multiply(response.getConversionMultiple()), response.getPort());
  }
  
}
