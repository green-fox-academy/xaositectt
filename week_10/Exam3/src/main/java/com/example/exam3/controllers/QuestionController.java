package com.example.exam3.controllers;

import com.example.exam3.factories.QuestionFactory;
import com.example.exam3.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

  @Autowired
  QuestionService questionService;

  @Autowired
  QuestionFactory questionFactory;


}
