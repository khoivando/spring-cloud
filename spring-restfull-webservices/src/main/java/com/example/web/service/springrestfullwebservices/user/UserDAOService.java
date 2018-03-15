/***************************************************************************
 * Copyright 2016 by HomeDirect - All rights reserved.                *    
 **************************************************************************/
package com.example.web.service.springrestfullwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

/**
 *  Author: Do Van Khoi
 *  Email: khoi.do@homedirect.com.vn
 *  Feb 22, 2018
 */
@Component
public class UserDAOService {

  private int usersCount = 3;
  private static List<User> users = new ArrayList<User>();
  
  static {
    users.add(new User(1, "Adam", new Date()));
    users.add(new User(2, "Eva", new Date()));
    users.add(new User(3, "Jack", new Date()));
  }

  public List<User> findAll() {
    return users;
  }

  public User findOne(int id) {
    Predicate<User> predicate = u -> {return id == u.getId();};
    Optional<User> optional = users.stream().filter(predicate).findFirst();
    if(optional.isPresent()) return optional.get();
    return null;
  }

  public User save(User user) {
    if(user.getId() == null) {
      user.setId(++usersCount);
    }
    users.add(user);
    return user;
  }
  
  public User deleteById(int id) {
    Iterator<User> iterator = users.iterator();
    while (iterator.hasNext()) {
      User user = iterator.next();
      if(id == user.getId()) {
        iterator.remove();
        return user;
      }
    }
    return null;
  }
  
}
