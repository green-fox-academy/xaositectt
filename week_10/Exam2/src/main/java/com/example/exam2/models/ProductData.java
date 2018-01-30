package com.example.exam2.models;

public class ProductData {

  private String name;
  private String size;
  private int quantity;

  public ProductData(String name, String size, int quantity) {
    this.name = name;
    this.size = size;
    this.quantity = quantity;
  }

  public ProductData() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

}
