package com.example.exam3.controllers;

import com.example.exam3.models.Answer;
import com.example.exam3.models.Question;
import com.example.exam3.services.QuestionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuestionNormalController {

  @Autowired
  QuestionService questionService;

  @GetMapping(value = "/question")
  public String question(Model model) {

    List<Question> questions = questionService.findAll();

    Answer myAnswer = questionService.getAnswerByQuestionId(1);

    model.addAttribute("questions", questions);
    model.addAttribute("answer", myAnswer);
    return "main";
  }

}
