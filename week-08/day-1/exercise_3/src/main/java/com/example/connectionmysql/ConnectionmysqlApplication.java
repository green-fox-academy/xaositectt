package com.example.connectionmysql;


import com.example.connectionmysql.models.Assignee;
import com.example.connectionmysql.models.Todo;
import com.example.connectionmysql.services.AssigneeService;
import com.example.connectionmysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionmysqlApplication implements CommandLineRunner {

  @Autowired
  TodoService todoService;

  @Autowired
  AssigneeService assigneeService;

  public static void main(String[] args) {
    SpringApplication.run(ConnectionmysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    Todo todo1 = new Todo("shit", false, false);
    Todo todo2 = new Todo("crap", false, false);
    Assignee assignee1 = new Assignee("snoop dogg", "snoop@dogg");
    Assignee assignee2 = new Assignee("notorius big", "notorius@big");
    Assignee assignee3 = new Assignee("2 pac", "2@pac");


    assignee1.addTodo(todo1);
    assignee1.addTodo(todo2);

    assigneeService.create(assignee1);
    assigneeService.create(assignee2);
    assigneeService.create(assignee3);

    todoService.create(todo1);
    todoService.create(todo2);

  }

}
