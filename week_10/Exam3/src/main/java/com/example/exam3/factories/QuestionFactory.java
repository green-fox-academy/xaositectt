package com.example.exam3.factories;


import com.example.exam3.models.Question;
import org.springframework.stereotype.Component;

@Component
public class QuestionFactory {

  public Question createQuestion() {
    Question question = new Question();
    return question;
  }
}
