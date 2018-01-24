package com.example.firstproject.models;

import java.util.Arrays;

public class ArrayObject {

  String what;
  Integer[] numbers;

  public ArrayObject(String what, Integer[] numbers) {
    this.what = what;
    this.numbers = numbers;
  }

  public ArrayObject() {
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public Integer[] getNumbers() {
    return numbers;
  }

  public void setNumbers(Integer[] numbers) {
    this.numbers = numbers;
  }

  public int sum(){
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum= sum+numbers[i];
    }
    return sum;
  }

  public int multiply(){
    int sum = 1;
    for (int i = 0; i < numbers.length; i++) {
      sum= sum*numbers[i];
    }
    return sum;
  }

  public Integer[] doubleNumbers(){
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = numbers[i]*2;
    }
    return numbers;
  }

  @Override
  public String toString(){
    return "what : " + what + " numbers : " + Arrays.toString(numbers);
  }
}
