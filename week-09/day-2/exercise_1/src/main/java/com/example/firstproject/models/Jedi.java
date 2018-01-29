package com.example.firstproject.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jedi {

  String text;

  public Jedi(String text) {
    this.text = text;
  }

  public Jedi() {
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public static String sithSpeak(String text) {
    List<String> sentences = sentenceLister(text);
    String adjustedText = "";
    for (String sentence : sentences) {
      List<String> wordList = wordLister(sentence);
      List<String> adjustedWordList = listElementSwap(wordList);
      String adjustedSentence = wordListIntoSentence(adjustedWordList) + randomShitGenerator();
      adjustedText = adjustedText + adjustedSentence;
    }
    return adjustedText;
  }

  public static List<String> sentenceLister(String text) {
    List<String> sentenceArrayList = Arrays.asList(text.split("\\s*\\.\\s*"));
    return sentenceArrayList;
  }

  public static List<String> wordLister(String text) {
    List<String> wordArrayList = Arrays.asList(text.split("\\s+"));
    return wordArrayList;
  }


  public static List<String> listElementSwap(List<String> sentence) {
    List<String> swappedElements = new ArrayList<>();
    if (sentence.size() == 1) {
      swappedElements = sentence;
    } else if (sentence.size() % 2 == 0) {
      swappedElements = swapElements(sentence);
    } else {
      swappedElements = swapElements(sentence);
      swappedElements.add(sentence.get(sentence.size() - 1));
    }
    return swappedElements;
  }

  public static List<String> swapElements(List<String> inputList) {
    List<String> swappedElements = new ArrayList<>();
    for (int i = 0; i < inputList.size() - 1; i = i + 2) {
      swappedElements.add(inputList.get(i + 1));
      swappedElements.add(inputList.get(i));
    }
    return swappedElements;
  }


  public static String wordListIntoSentence(List<String> wordList) {
    String sentence = "";
    for (String word : wordList) {
      sentence = sentence + word + " ";
    }
    sentence = sentence.toLowerCase().replaceAll("\\s+$", "") + ". ";
    String capitalStart = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);
    return capitalStart;
  }

  public static String randomShitGenerator() {
    List<String> randomShit = Arrays
        .asList("Eh eh erh. ", "Oook oook. ", "Yeech. "
            , "Heil Hydra. ", "Ergh ergh. ");
    String randomElement = randomShit.get((int) (Math.random() * randomShit.size()));
    return randomElement;
  }
}
