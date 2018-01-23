package com.example.firstproject.controllers;

import com.example.firstproject.models.Appended;
import com.example.firstproject.models.Doubling;
import com.example.firstproject.models.ErrorClass;
import com.example.firstproject.models.Greeting;
import com.example.firstproject.models.ResponseSomething;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController1 {

  @GetMapping(value = "/doubling")
  public ResponseSomething doubling(
      @RequestParam(value = "input", required = false) Integer number) {
    if (number == null) {
      return new ErrorClass("Please provide an input!");
    } else {
      return new Doubling(number);
    }
  }

  @GetMapping(value = "/greeter")
  public ResponseSomething greeter(@RequestParam(value = "name", required = false) String name,
      @RequestParam(value = "title", required = false) String title) {
    if (name == null) {
      return new ErrorClass("Please provide a name!");
    } else if (title == null) {
      return new ErrorClass("Please provide a title!");
    } else if (title == null && name == null) {
      return new ErrorClass("Please provide a name and title!");
    } else {
      return new Greeting(name, title);
    }
  }

  @GetMapping(value = "/appenda/{appendable}")
  public ResponseSomething append(@PathVariable String appendable) {
   if (appendable == null) {
     return new ResponseEntity<>(HttpStatus.NOT_FOUND);
   }
    return new Appended(appendable);
  }

}

