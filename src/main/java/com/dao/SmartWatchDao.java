package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.SmartWatchBean;

@Repository
public class SmartWatchDao {

  @Autowired
  JdbcTemplate stmt;

  public void addSmartWatch(SmartWatchBean bean){
    String sql = "INSERT INTO SmartWatch (name, brand, battery, features, display, quantity, price, smartWatchImagePath) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    stmt.update(sql, bean.getName(), bean.getBrand(), bean.getBattery(), bean.getFeatures(), bean.getDisplay(), bean.getQuantity(), bean.getPrice(), bean.getSmartWatchImagePath());

  }
  
}
