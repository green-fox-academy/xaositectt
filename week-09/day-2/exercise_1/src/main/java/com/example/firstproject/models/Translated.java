package com.example.firstproject.models;

public class Translated {

  String translated;
  String lang;

  public Translated(String translated, String lang) {
    this.translated = translated;
    this.lang = lang;
  }

  public Translated() {
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }

  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }
}
