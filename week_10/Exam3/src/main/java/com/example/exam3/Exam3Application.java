package com.example.exam3;

import com.example.exam3.factories.QuestionFactory;
import com.example.exam3.models.Question;
import com.example.exam3.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exam3Application implements CommandLineRunner {

  @Autowired
  QuestionService questionService;

  @Autowired
  QuestionFactory questionFactory;


  public static void main(String[] args) {
    SpringApplication.run(Exam3Application.class, args);
  }

  @Override
  public void run(String... strings) throws Exception {

    Question question1 = questionFactory.createQuestion();
    question1.setQuestion("When did your course start? (yyyy.mm.dd)(2017.03.13)");
    Question question2 = questionFactory.createQuestion();
    question2.setQuestion("What type of dog Barbi has? (Whippet)");
    Question question3 = questionFactory.createQuestion();
    question3.setQuestion("What is HerrNorbert's favourite color? (Green)");
    Question question4 = questionFactory.createQuestion();
    question4.setQuestion("How many classes are learning at Green Fox Academy at this moment? (4)");
    Question question5 = questionFactory.createQuestion();
    question5.setQuestion("How many mentors teach at Green Fox at this moment? (16)");
    Question question6 = questionFactory.createQuestion();
    question6.setQuestion("What was the name of the first Green Fox class? (Vulpes)");
    Question question7 = questionFactory.createQuestion();
    question7.setQuestion("How many likes do we have on facebook? (~3300)");
    Question question8 = questionFactory.createQuestion();
    question8.setQuestion("What is Tojas's horoscope? (Libra)");

    questionService.addQuestion(question1);
    questionService.addQuestion(question2);
    questionService.addQuestion(question3);
    questionService.addQuestion(question4);
    questionService.addQuestion(question5);
    questionService.addQuestion(question6);
    questionService.addQuestion(question7);
    questionService.addQuestion(question8);

  }
}
