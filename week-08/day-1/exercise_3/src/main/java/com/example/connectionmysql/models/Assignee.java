package com.example.connectionmysql.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "ASSIGNEE")
public class Assignee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "assignee_id")
  private int id;

  private String name;
  private String email;

  @OneToMany(mappedBy = "assignee", cascade = CascadeType.ALL)
  private List<Todo> todos;

  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
    this.todos = new ArrayList<>();
  }

  public Assignee() {
  }

  //  @OneToOne(fetch = FetchType.LAZY, mappedBy = "assignee", cascade = CascadeType.ALL)
//  private Todo todo;

//  public Todo getTodo() {
//    return todo;
//  }
//
//  public void setTodo(Todo todo) {
//    this.todo = todo;
//  }

  public List<Todo> getTodos() {
    return todos;
  }

  public void setTodos(List<Todo> todos) {
    this.todos = todos;
  }

  public void addTodo(Todo todo) {
    todo.setAssignee(this);
    todos.add(todo);
  }

  public Todo getTodo(int id) {
    Todo returnTodo = new Todo();
    for (Todo todo : todos) {
      if (todo.getId() == id) {
        returnTodo = todo;
      }
    }
    return returnTodo;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


}
