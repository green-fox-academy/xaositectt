package com.example.firstproject.models;

public class Factor {

  int result;

  public Factor(int until) {
    this.result = factorial(until);
  }

  public Factor() {
  }

  public int factorial(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
