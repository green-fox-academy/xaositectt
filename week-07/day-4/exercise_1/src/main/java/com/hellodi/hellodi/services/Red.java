package com.hellodi.hellodi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Red implements MyColor {

  private String color = "Red";

  @Autowired
  Printer printer;

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public void printColor() {
    printer.log(color);
  }
}
