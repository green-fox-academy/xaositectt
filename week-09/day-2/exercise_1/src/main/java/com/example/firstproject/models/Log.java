package com.example.firstproject.models;

import java.text.SimpleDateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Log {

  @Id
  int id;
  SimpleDateFormat createdAt;
  String endpoint;
  String data;

  public Log(String endpoint, String data) {
    this.createdAt = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    this.endpoint = endpoint;
    this.data = data;
  }

  public Log() {
  }
}
