package com.example.connectionmysql.models;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TODO")
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "todo_id")
  private int id;

  private String title;
  private boolean isurgent;
  private boolean isdone;
  private Date date;

  @ManyToOne(cascade = CascadeType.ALL)
  private Assignee assignee;

  public Todo(String title, boolean isurgent, boolean isdone) {
    this.title = title;
    this.isurgent = isurgent;
    this.isdone = isdone;
    this.date = new Date();

  }

  //  @OneToOne(fetch = FetchType.LAZY)
//  @JoinColumn(name = "assignee_id")
//  private Assignee assignee;

  public Todo() {
  }

  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
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

  public boolean getIsurgent() {
    return isurgent;
  }

  public void setIsurgent(boolean isurgent) {
    this.isurgent = isurgent;
  }

  public boolean getIsdone() {
    return isdone;
  }

  public void setIsdone(boolean isdone) {
    this.isdone = isdone;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

}
