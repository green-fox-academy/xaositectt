/*Create a PostIt class that has
        a backgroundColor
        a text on it
        a textColor
        Create a few example post-it objects:
        an orange with blue text: "Idea 1"
        a pink with black text: "Awesome"
        a yellow with green text: "Superb!"*/

import java.util.Scanner;

public class postit {
  String backgroundColor;
  String text;
  String textColor;
  public postit(){}

  public static void main(String[] args) {
    postit myPostit1 = new postit();
    myPostit1.backgroundColor = "black";
    myPostit1.text = "this postit is black";
    myPostit1.textColor = "white";

    postit myPostit2 = new postit();
    myPostit2.backgroundColor = "red";
    myPostit2.text = "this postit is red";
    myPostit2.textColor = "green";

    postit myPostit3 = new postit();
    myPostit3.backgroundColor = "blue";
    myPostit3.text = "this postit is blue";
    myPostit3.textColor = "red";
  }
}



