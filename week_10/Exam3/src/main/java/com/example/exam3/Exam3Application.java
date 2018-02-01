package com.example.exam3;

import com.example.exam3.factories.QuestionFactory;
import com.example.exam3.models.Answer;
import com.example.exam3.models.Question;
import com.example.exam3.services.AnswerService;
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

  @Autowired
  AnswerService answerService;


  public static void main(String[] args) {
    SpringApplication.run(Exam3Application.class, args);
  }

  @Override
  public void run(String... strings) throws Exception {

    Question question1 = questionFactory.createQuestion();
    question1.setQuestionString("When did your course start? (yyyy.mm.dd)(2017.03.13)");
    Question question2 = questionFactory.createQuestion();
    question2.setQuestionString("What type of dog Barbi has? (Whippet)");
    Question question3 = questionFactory.createQuestion();
    question3.setQuestionString("What is HerrNorbert's favourite color? (Green)");
    Question question4 = questionFactory.createQuestion();
    question4.setQuestionString("How many classes are learning at Green Fox Academy at this moment? (4)");
    Question question5 = questionFactory.createQuestion();
    question5.setQuestionString("How many mentors teach at Green Fox at this moment? (16)");
    Question question6 = questionFactory.createQuestion();
    question6.setQuestionString("What was the name of the first Green Fox class? (Vulpes)");
    Question question7 = questionFactory.createQuestion();
    question7.setQuestionString("How many likes do we have on facebook? (~3300)");
    Question question8 = questionFactory.createQuestion();
    question8.setQuestionString("What is Tojas's horoscope? (Libra)");

    Answer answer1 = new Answer();
    answer1.setAnswer("anything");
    answer1.setMyQuestion(question1);

    Answer answer2 = new Answer();
    answer2.setAnswer("anything2");
    answer2.setMyQuestion(question2);

    Answer answer3 = new Answer();
    answer3.setAnswer("anything3");
    answer3.setMyQuestion(question3);


    questionService.addQuestion(question1);
    questionService.addQuestion(question2);
    questionService.addQuestion(question3);

    answerService.addAnswer(answer1);
    answerService.addAnswer(answer2);
    answerService.addAnswer(answer3);
//    questionService.addQuestion(question4);
//    questionService.addQuestion(question5);
//    questionService.addQuestion(question6);
//    questionService.addQuestion(question7);
//    questionService.addQuestion(question8);

  }
}
