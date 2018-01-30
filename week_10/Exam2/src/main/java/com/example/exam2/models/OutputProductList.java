package com.example.exam2.models;

import java.util.List;

public class OutputProductList {

  private List<Product> clothes;
  String result;

  public OutputProductList(List<Product> clothes) {
    this.clothes = clothes;
    this.result = result;
  }

  public OutputProductList() {
  }

  public List<Product> getClothes() {
    return clothes;
  }

  public void setClothes(List<Product> clothes) {
    this.clothes = clothes;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }
}
