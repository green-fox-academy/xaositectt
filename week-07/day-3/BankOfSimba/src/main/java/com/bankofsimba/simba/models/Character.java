package com.bankofsimba.simba.models;

//Add the fields name, balance, animalType in it

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Character {


  private String name;
  private int experience;
  private String myClass;
  private String alignment;
  private String portrait;

  private List<String> classes = new ArrayList<String>(
      Arrays.asList("Warrior", "Rogue", "Priest",
          "Mage", "Druid", "Paladin",
          "Ranger", "Monk", "Sorcerer"));


  private List<String> alignments = new ArrayList<String>(
      Arrays.asList("Lawful Good", "Neutral Good", "Chaotic Good",
          "Lawful Neutral", "True Neutral", "Chaotic Neutral",
          "Lawful Evil", "Neutral Evil", "Chaotic Good"));

  public Character(String name, String portrait) {

    this.name = name;

    this.experience = (int) (1000 + Math.random() * 1000);

    int b = (int) (Math.random() * classes.size());
    this.myClass = classes.get(b);

    int c = (int) (Math.random() * alignments.size());
    this.alignment = alignments.get(c);

    this.portrait = portrait;

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getExperience() {
    return experience;
  }

  public void setExperience(int experience) {
    this.experience = experience;
  }

  public String getMyClass() {
    return myClass;
  }

  public void setMyClass(String myClass) {
    this.myClass = myClass;
  }

  public String getAlignment() {
    return alignment;
  }

  public void setAlignment(String alignment) {
    this.alignment = alignment;
  }

  public String getPortrait() {
    return portrait;
  }

  public void setPortrait(String portrait) {
    this.portrait = portrait;
  }
}
