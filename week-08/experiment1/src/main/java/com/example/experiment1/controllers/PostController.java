package com.example.experiment1.controllers;

import com.example.experiment1.Services.PostService;
import com.example.experiment1.domain.Post;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

  @Autowired
  PostService postService;

  @GetMapping(value = "/blog")
  public String showdata(Model model) {
    List<Post> posts;

    posts = postService.getAllPosts();

    model.addAttribute("posts", posts);


    return "template";
  }

}
