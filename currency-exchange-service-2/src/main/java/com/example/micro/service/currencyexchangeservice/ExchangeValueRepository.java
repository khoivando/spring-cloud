/***************************************************************************
 * Copyright 2016 by HomeDirect - All rights reserved.                *    
 **************************************************************************/
package com.example.micro.service.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  Author: Do Van Khoi
 *  Email: khoi.do@homedirect.com.vn
 *  Feb 21, 2018
 */
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
  
   ExchangeValue findByFromAndTo(String from, String to);
  
}
