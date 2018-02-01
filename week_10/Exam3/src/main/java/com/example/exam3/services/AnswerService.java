package com.example.exam3.services;

import com.example.exam3.models.Answer;
import com.example.exam3.models.Question;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface AnswerService {


  public List<Answer> findAll();


  public void addAnswer(Answer answer);
}
