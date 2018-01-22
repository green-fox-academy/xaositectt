package com.example.experiment1.Services;

import com.example.experiment1.domain.Post;
import com.example.experiment1.domain.Poster;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface PostService {

  List<Post> getAllPosts();
  Post getPost(int id);
  void addPost(Post post);
  void modifyPost(Post post);
  void deletePost(int id);

}
