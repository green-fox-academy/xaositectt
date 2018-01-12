package com.hellodi.hellodi;

import com.hellodi.hellodi.services.Green;
import com.hellodi.hellodi.services.Printer;
import com.hellodi.hellodi.services.Red;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HellodiApplication implements CommandLineRunner {

  @Autowired
  Printer p;

  @Autowired
  Red red;

  @Autowired
  Green green;

  public static void main(String[] args) {
    SpringApplication.run(HellodiApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    p.log("hello");

    red.printColor();

    green.printColor();

    //p.log(red.getColor());
  }
}
