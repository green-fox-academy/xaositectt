//Add a Todo class with the fields(id:int, title:String, isUrgent:boolean(default false),
//    isDone:boolean(default false))

package com.greenfox.todo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String title;
  private boolean isUrgent;

  public ToDo(String title, boolean isUrgent) {
    this.title = title;
    this.isUrgent = isUrgent;
  }

  public ToDo() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return isUrgent;
  }

  public void setUrgent(boolean urgent) {
    isUrgent = urgent;
  }
}
