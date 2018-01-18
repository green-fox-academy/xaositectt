package com.example.connectionmysql.services;

import com.example.connectionmysql.models.Todo;
import com.example.connectionmysql.repository.TodoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {

  @Autowired
  TodoRepo todoRepository;


  @Override
  public List<Todo> getAllTodos() {
    List<Todo> todos;
    todos = (List<Todo>) todoRepository.findAll();
    return todos;
  }

  @Override
  public Todo getTodo(int id) {
    Todo todo;
    todo = todoRepository.findOne(id);
    return todo;
  }

  @Override
  public void modifyTodo(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public void create(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public void delete(int id) {
    todoRepository.delete(id);
  }
}
