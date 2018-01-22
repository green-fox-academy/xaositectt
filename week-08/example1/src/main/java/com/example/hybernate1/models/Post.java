package com.example.hybernate1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "post_id")
  private int id;

  private String title;
  private int rating;

  //  @ManyToOne(cascade = CascadeType.ALL)
  private Poster poster;

  public Post(String title, int rating) {
    this.title = title;
    this.rating = rating;
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

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public Poster getPoster() {
    return poster;
  }

  public void setPoster(Poster poster) {
    this.poster = poster;

  }
}
