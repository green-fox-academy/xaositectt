package com.example.exam2again.models;

public class ClothData {

  private String name;
  private String size;
  private int amount;

  public ClothData(String name, String size, int amount) {
    this.name = name;
    this.size = size;
    this.amount = amount;
  }

  public ClothData() {
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

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }
}
