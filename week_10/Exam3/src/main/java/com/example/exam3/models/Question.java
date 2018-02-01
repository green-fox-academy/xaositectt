package com.example.exam3.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "question_table")
public class Question {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;

  String questionString;

  @OneToOne(fetch= FetchType.LAZY)
  @JoinColumn(name="id")
  Answer myAnswer;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Answer getMyAnswer() {
    return myAnswer;
  }

  public void setMyAnswer(Answer myAnswer) {
    this.myAnswer = myAnswer;
  }

  public Question() {
  }

  public Question(String questionString, Answer myAnswer) {

    this.questionString = questionString;
    this.myAnswer = myAnswer;
  }

  public String getQuestionString() {
    return questionString;
  }

  public void setQuestionString(String questionString) {
    this.questionString = questionString;
  }
}
