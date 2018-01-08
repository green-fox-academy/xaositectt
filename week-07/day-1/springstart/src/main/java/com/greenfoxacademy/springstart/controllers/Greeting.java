package com.greenfoxacademy.springstart.controllers;

public class Greeting {

  private long id;
  private String content;


  public Greeting( long id, String content) {
    this.content = content;
    this.id = id;
  }

  public Greeting() {
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
}
