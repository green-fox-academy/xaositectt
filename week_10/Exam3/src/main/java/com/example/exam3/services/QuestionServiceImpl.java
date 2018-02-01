package com.example.exam3.services;

import com.example.exam3.models.Question;
import com.example.exam3.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {

  @Autowired
  QuestionRepository questionRepository;


  @Override
  public Question getRandomQuestion() {
    return null;
  }

  @Override
  public void addQuestion(Question question) {
    questionRepository.save(question);
  }
}
