import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SithTester {

  public static void main(String[] args) {

    String mySentence = "It is a glorious sun. Another way is the moon there.";
    List<String> sentences = sentenceLister(mySentence);
    System.out.println(sentences);
    List<String> words1 = wordLister(sentences.get(0));
    List<String> words2 = wordLister(sentences.get(1));
    List<String> swappedElements = listElementSwap(words1);
    System.out.println(swappedElements);
    String sentence = wordListIntoSentence(swappedElements);
    System.out.println(sentence);
    System.out.println(randomShitGenerator());
    System.out.println(sithSpeak(mySentence));
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
    List<String> wordArrayList = Arrays.asList(text.split(" "));
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
