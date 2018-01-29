package com.example.trialexam.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "licence_plates")
@Entity
public class Car {

  @Id
  private String plate;
  private String brand;
  private String model;
  private String color;
  private String year;

  public Car(String plate, String brand, String model, String color, String year) {
    this.plate = plate;
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.year = year;
  }

  public Car() {
  }

  public String getPlate() {
    return plate;
  }

  public void setPlate(String plate) {
    this.plate = plate;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String car_brand) {
    this.brand = car_brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String car_model) {
    this.model = car_model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

}
