package main;

public class TennisGameImpl implements TennisGame {

  @Override
  public void wonPoint(TennisPlayer tennisPlayer) {
    tennisPlayer.setScore(tennisPlayer.getScore() + 1);
  }

  @Override
  public String getScore(TennisPlayer tennisPlayer1, TennisPlayer tennisPlayer2) {
    String score;
    int tennisPlayer1Score = tennisPlayer1.getScore();
    int tennisPlayer2Score = tennisPlayer2.getScore();

    if (tennisPlayer1Score == tennisPlayer2Score) {
      score = ifScoresAreEqual(tennisPlayer1Score);
    } else if (tennisPlayer1Score >= 4 || tennisPlayer2Score >= 4) {
      score = ifOneScoreBiggerThan4(tennisPlayer1Score, tennisPlayer2Score);
    } else {
      score = ifScoresNotEqualAndSmallerThan4(tennisPlayer1Score, tennisPlayer2Score);
    }

    return score;
  }

  public String ifScoresAreEqual(int playerScore) {
    String score;
    switch (playerScore) {
      case 0:
        score = "Love-All";
        break;
      case 1:
        score = "Fifteen-All";
        break;
      case 2:
        score = "Thirty-All";
        break;
      case 3:
        score = "Forty-All";
        break;
      default:
        score = "Deuce";
        break;
    }
    return score;
  }

  public String ifOneScoreBiggerThan4(int playerScore1, int playerScore2) {
    String score;
    int resultDifference = playerScore1 - playerScore2;
    if (resultDifference == 1) {
      score = "Advantage player1";
    } else if (resultDifference == -1) {
      score = "Advantage player2";
    } else if (resultDifference >= 2) {
      score = "Win for player1";
    } else {
      score = "Win for player2";
    }
    return score;
  }

  public String ifScoresNotEqualAndSmallerThan4(int playerScore1, int playerScore2) {
    String score = "";
    int tempScore;
    for (int i = 1; i < 3; i++) {
      if (i == 1) {
        tempScore = playerScore1;
      } else {
        score += "-";
        tempScore = playerScore2;
      }
      switch (tempScore) {
        case 0:
          score += "Love";
          break;
        case 1:
          score += "Fifteen";
          break;
        case 2:
          score += "Thirty";
          break;
        case 3:
          score += "Forty";
          break;
      }
    }

    return score;
  }

}


