package com.example.lightningtalk.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LightningTalk {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String topic;
  private String date;

  public LightningTalk(String topic, String date) {
    this.topic = topic;
    this.date = date;
  }

  public LightningTalk() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }
}
