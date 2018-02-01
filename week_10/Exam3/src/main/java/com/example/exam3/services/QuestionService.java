package com.example.exam3.services;

import com.example.exam3.models.Answer;
import com.example.exam3.models.Question;
import java.util.List;
import javax.persistence.Entity;
import org.springframework.stereotype.Service;

@Service
public interface QuestionService {

  public List<Question> findAll();

  public Question getRandomQuestion();

  public void addQuestion(Question question);

  public Answer getAnswerByQuestionId(int id);

}
