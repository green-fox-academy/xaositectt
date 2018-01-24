package com.example.firstproject.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;



public class NumberSum {

  Integer result;

  public NumberSum(Integer number) {
    this.result = adder(number);
  }

  public NumberSum() {
  }

  public int adder(int n) {
    if (n == 0) {
      return 0;
    } else {
      return n + adder(n - 1);
    }
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
