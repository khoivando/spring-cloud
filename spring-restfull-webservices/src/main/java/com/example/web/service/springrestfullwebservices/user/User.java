/***************************************************************************
 * Copyright 2016 by HomeDirect - All rights reserved.                *    
 **************************************************************************/
package com.example.web.service.springrestfullwebservices.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

/**
 *  Author: Do Van Khoi
 *  Email: khoi.do@homedirect.com.vn
 *  Feb 22, 2018
 */
public class User {
  private Integer id;
  @Size(min = 5, message = "Name should be atleast 5 characters")
  private String name;
  @Past
  private Date birthDate;
  public User() {
    super();
  }
  public User(Integer id, String name, Date birthDate) {
    super();
    this.id = id;
    this.name = name;
    this.birthDate = birthDate;
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Date getBirthDate() {
    return birthDate;
  }
  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }
  @Override
  public String toString() {
    return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
  }
}
