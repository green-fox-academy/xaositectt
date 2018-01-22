package com.example.hybernate1.services;

import com.example.hybernate1.models.Post;
import com.example.hybernate1.repositories.PostRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

  @Autowired
  PostRepo postRepo;

  @Override
  public List<Post> getAllPosts() {
    List<Post> posts;
    posts = (List<Post>) postRepo.findAll();
    return posts;
  }

  @Override
  public Post getPost(int id) {
    Post post;
    post = postRepo.findOne(id);
    return post;
  }

  @Override
  public void addPost(Post post) {
    postRepo.save(post);

  }

  @Override
  public void deletePost(int id) {
    postRepo.delete(id);
  }

  @Override
  public void editPost(Post post) {
    postRepo.save(post);
  }
}
