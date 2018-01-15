package com.greenfox.todo;

import com.greenfox.todo.models.ToDo;
import com.greenfox.todo.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TodoApplication implements CommandLineRunner {


  @Autowired
  TodoRepo todoRepo;

  public static void main(String[] args) {
    SpringApplication.run(TodoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    todoRepo.save(new ToDo("I have to learn Object Relational Mapping", false));

  }
}
