package com.example.exam3.services;

import com.example.exam3.models.Question;

public interface QuestionService {

  public Question getRandomQuestion();

  public void addQuestion(Question question);

}
