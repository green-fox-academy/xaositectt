package com.hellodi.hellodi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Green implements MyColor {

  private String color = "Green";

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
    //System.out.println(color);
    printer.log(color);
  }
}
