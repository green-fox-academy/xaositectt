package com.greenfoxacademy.springstart.controllers;


import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  private AtomicLong atomicLong = new AtomicLong(1);

  @RequestMapping(value = "/greeting")
  public Greeting greetingMethod(@RequestParam("name") String content){
    //AtomicLong atomicLong = new AtomicLong(1);
    return new Greeting(atomicLong.getAndIncrement(),content );
  }
}

