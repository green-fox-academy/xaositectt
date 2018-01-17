package com.example.connectionmysql.services;

import com.example.connectionmysql.models.Todo;
import com.example.connectionmysql.repository.TodoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceDBI implements TodoService {

  @Autowired
  TodoRepo talksRepository;


  @Override
  public List<Todo> getAllTodos() {
    List<Todo> todos;
    todos = (List<Todo>) talksRepository.findAll();
    return todos;
  }

  @Override
  public Todo getTodo(int id) {
    return new Todo();
  }

  @Override
  public void modifyTodo(Todo todo) {

  }

  @Override
  public void create(Todo todo) {

  }

  @Override
  public void delete(int id) {

  }
}
