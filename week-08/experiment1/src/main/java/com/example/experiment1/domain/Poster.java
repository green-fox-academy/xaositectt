package com.example.experiment1.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="POSTERS")
public class Poster {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String name;
  private String email;

  @OneToMany(mappedBy = "poster", cascade = CascadeType.ALL)
  private List<Post> postList;

  public Poster(String name, String email) {
    this.name = name;
    this.email = email;
    postList= new ArrayList<>();
  }

  public List<Post> getPostList() {
    return postList;
  }

  public void setPostList(List<Post> postList) {
    this.postList = postList;
  }

  public void addToPostList(Post post) {
    this.postList.add(post);
    post.setPoster(this);
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
}
