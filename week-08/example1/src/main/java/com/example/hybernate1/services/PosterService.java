package com.example.hybernate1.services;

import com.example.hybernate1.models.Poster;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface PosterService {

  List<Poster> getAllPosters();
  Poster getPoster(int id);
  void addPoster(Poster poster);
  void deletePoster(int id);
  void editPoster(Poster poster);
}
