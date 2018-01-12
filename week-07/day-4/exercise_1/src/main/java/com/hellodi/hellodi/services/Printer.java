package com.hellodi.hellodi.services;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service
public class Printer {
  public String log(String message) {
    System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    return message;
  }
}