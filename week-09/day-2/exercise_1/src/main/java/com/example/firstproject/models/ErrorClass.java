package com.example.firstproject.models;

public class ErrorClass implements ResponseSomething {

  String error;

  public ErrorClass(String error) {
    this.error = error;
  }

  public ErrorClass() {
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
