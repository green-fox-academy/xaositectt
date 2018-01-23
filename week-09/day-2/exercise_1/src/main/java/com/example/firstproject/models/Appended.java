package com.example.firstproject.models;

public class Appended implements  ResponseSomething{

  String appended;

  public Appended(String appended) {
    this.appended = appended + "a";
  }

  public Appended() {
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
