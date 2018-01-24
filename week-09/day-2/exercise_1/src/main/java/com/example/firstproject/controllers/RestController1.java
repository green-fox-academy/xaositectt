package com.example.firstproject.controllers;

import com.example.firstproject.models.Appended;
import com.example.firstproject.models.ArrayHandlerDouble;
import com.example.firstproject.models.ArrayHandlerSumMultiply;
import com.example.firstproject.models.ArrayObject;
import com.example.firstproject.models.Doubling;
import com.example.firstproject.models.ErrorClass;
import com.example.firstproject.models.Factor;
import com.example.firstproject.models.Greeting;
import com.example.firstproject.models.NewNumber;
import com.example.firstproject.models.NumberSum;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController1 {

  @GetMapping(value = "/doubling")
  public Object doubling(
      @RequestParam(value = "input", required = false) Integer number) {
    if (number == null) {
      return new ErrorClass("Please provide an input!");
    } else {
      return new Doubling(number);
    }
  }

  @GetMapping(value = "/greeter")
  public Object greeter(@RequestParam(value = "name", required = false) String name,
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
  public Object append(@PathVariable String appendable) {
    if (appendable == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    } else {
      return new Appended(appendable);
    }
  }

  @PostMapping(value = "/dountil/{what}")
  public Object doUntil(@RequestBody(required = false) NewNumber newnumber,
      @PathVariable(name = "what", required = false) String what) {
    if (newnumber == null) {
      return new ErrorClass("Please provide a number!");
    } else if (what.equals("sum")) {
      return new NumberSum(newnumber.getUntil());
    } else if (what.equals("factor")) {
      return new Factor(newnumber.getUntil());
    } else {
      return new ErrorClass("This is not a valid url");
    }
  }

  @PostMapping(value = "/arrays")
  public Object arrays(@RequestBody(required = false) ArrayObject arrayObject) {
    if (arrayObject == null) {
      return new ErrorClass("Please provide data!");
    } else if (arrayObject.getWhat() == null || arrayObject.getNumbers() == null) {
      return new ErrorClass("Please provide what to do with the numbers!");
    } else if (arrayObject.getWhat().equals("sum")) {
      return new ArrayHandlerSumMultiply(arrayObject.sum());
    } else if (arrayObject.getWhat().equals("multiply")) {
      return new ArrayHandlerSumMultiply(arrayObject.multiply());
    } else if (arrayObject.getWhat().equals("double")) {
      return new ArrayHandlerDouble(arrayObject.doubleNumbers());
    } else {
      return "this is an invalid operation";
    }
  }


}

