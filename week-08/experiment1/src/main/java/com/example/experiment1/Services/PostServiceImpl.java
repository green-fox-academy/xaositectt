package com.example.experiment1.Services;

import com.example.experiment1.domain.Post;
import com.example.experiment1.domain.Poster;
import com.example.experiment1.repositories.PostRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{

  @Autowired
  PostRepository postRepository;

  @Override
  public List<Post> getAllPosts() {
    List<Post> posters;
    posters = (List<Post>) postRepository.findAll();
    return posters;
  }

  @Override
  public Post getPost(int id) {
    return postRepository.findOne(id);
  }

  @Override
  public void addPost(Post post) {
    postRepository.save(post);
  }

  @Override
  public void modifyPost(Post post) {
    postRepository.save(post);
  }

  @Override
  public void deletePost(int id) {
    postRepository.delete(id);
  }
}
