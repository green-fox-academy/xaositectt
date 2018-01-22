package com.example.hybernate1.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "posters")
public class Poster {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "poster_id")
  private int id;

  private String name;
  private String email;

  //  @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
  private List<Post> posts;

  public Poster(String name, String email) {
    this.name = name;
    this.email = email;
    this.posts = new ArrayList<>();
  }

  public Poster() {
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

  public List<Post> getPosts() {
    return posts;
  }

  public void addPost(Post post) {
    this.posts.add(post);
    post.setPoster(this);
  }
}
