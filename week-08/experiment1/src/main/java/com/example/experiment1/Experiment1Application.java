package com.example.experiment1;

import com.example.experiment1.Services.PostService;
import com.example.experiment1.Services.PosterService;
import com.example.experiment1.domain.Post;
import com.example.experiment1.domain.Poster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Experiment1Application implements CommandLineRunner {

  @Autowired
  PostService postService;

  @Autowired
  PosterService posterService;


  public static void main(String[] args) {
    SpringApplication.run(Experiment1Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    Poster poster1 = new Poster("Snoop Dogg", "snoop@dogg");

    Post post1 = new Post("What?", "What's the matter");
    Post post2 = new Post("Hey?", "Why");
    Post post3 = new Post("Hello?", "Whatever");

    poster1.addToPostList(post1);
    poster1.addToPostList(post2);
    poster1.addToPostList(post3);

    posterService.addPoster(poster1);

    postService.addPost(post1);
    postService.addPost(post2);
    postService.addPost(post3);

  }
}
