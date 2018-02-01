package com.example.exam3.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "question_table")
public class Question {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;
  String question;

  public Question(String question) {
    this.question = question;
  }

  public Question() {
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }
}
