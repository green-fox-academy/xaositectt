package com.example.exam3.services;

import com.example.exam3.models.Answer;
import com.example.exam3.models.Question;
import com.example.exam3.repositories.AnswerRepository;
import com.example.exam3.repositories.QuestionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerServiceImpl implements AnswerService{


  @Autowired
  AnswerRepository answerRepository;


  @Override
  public List<Answer> findAll() {
   return (List<Answer>)answerRepository.findAll();
  }

  @Override
  public void addAnswer(Answer answer) {
    answerRepository.save(answer);
  }
}
