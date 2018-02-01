package com.example.exam3.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="answer")
public class Answer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;
  String answer;


  @OneToOne(fetch= FetchType.LAZY, mappedBy="myAnswer")
  Question myQuestion;

  public Answer(String answer, Question myQuestion) {
    this.answer = answer;
    this.myQuestion = myQuestion;
  }

  public Answer() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public Question getMyQuestion() {
    return myQuestion;
  }

  public void setMyQuestion(Question myQuestion) {
    this.myQuestion = myQuestion;
  }
}
