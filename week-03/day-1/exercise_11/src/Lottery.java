// Create a method that find the 5 most common lottery numbers otos.csv

import java.nio.file.*;
import java.util.*;
import java.io.*;

public class Lottery {
  public static void main(String[] args) {
    Path myPath =Paths.get("src/otos.csv");
    findNumber(myPath);

  }

  private static void findNumber(Path myPath) {
    try {
      List<String> lottoList = Files.readAllLines(myPath);
      System.out.println(lottoList);
    } catch (Exception e){}

  }
}
