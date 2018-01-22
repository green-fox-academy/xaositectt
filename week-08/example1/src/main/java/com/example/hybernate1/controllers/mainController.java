package com.example.hybernate1.controllers;


import com.example.hybernate1.models.Post;
import com.example.hybernate1.services.PostService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

  @Autowired
  PostService postService;


  @GetMapping(value = "/blog")
  public String showdata(Model model) {
    List<Post> posts;

    posts = postService.getAllPosts();

    model.addAttribute("posts", posts);

    return "index";
  }

}
