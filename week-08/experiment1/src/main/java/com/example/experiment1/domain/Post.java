package com.example.experiment1.domain;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "POSTS")
public class Post {

  Date date;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String title;
  private String text;

  @ManyToOne(cascade = CascadeType.ALL)
  private Poster poster;

  public Post(String title, String text) {
    this.title = title;
    this.text = text;
    date = new Date();
  }

  public Poster getPoster() {
    return poster;
  }

  public void setPoster(Poster poster) {
    this.poster = poster;
  }

  public Post() {
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

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Date getDate() {
    return date;
  }
}
