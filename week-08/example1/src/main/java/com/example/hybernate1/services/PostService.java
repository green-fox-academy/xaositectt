package com.example.hybernate1.services;

import com.example.hybernate1.models.Post;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface PostService {

  List<Post> getAllPosts();
  Post getPost(int id);
  void addPost(Post post);
  void deletePost(int id);
  void editPost(Post post);

}
