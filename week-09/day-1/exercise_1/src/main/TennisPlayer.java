package main;

public class TennisPlayer {

  private int score;
  private String name;

  public TennisPlayer(int score, String name) {
    this.score = score;
    this.name = name;
  }

  public TennisPlayer() {
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
