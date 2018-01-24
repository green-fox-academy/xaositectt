package com.example.firstproject.models;

public class Sith {

  String sith_text;

  public Sith(String text) {
    this.sith_text = text;
  }

  public Sith() {
  }

  public String getText() {
    return sith_text;
  }

  public void setText(String text) {
    this.sith_text= text;
  }
}
