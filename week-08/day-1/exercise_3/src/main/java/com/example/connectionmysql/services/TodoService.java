package com.example.connectionmysql.services;

import com.example.connectionmysql.models.Todo;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface TodoService {

  List<Todo> getAllTodos();

  Todo getTodo(int id);

  void modifyTodo(Todo todo);

  void create(Todo todo);

  void delete(int id);

}
