package com.example.trialexam.models;

import java.util.ArrayList;
import java.util.List;

public class Cars {

  String result;
  List<Car> data;


  public Cars(List<Car> cars, String result) {
    this.data = new ArrayList<>();
    this.result = result;
  }

  public Cars() {
  }

  public List<Car> getCars() {
    return data;
  }

  public void setCars(List<Car> cars) {
    this.data = cars;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }
}
