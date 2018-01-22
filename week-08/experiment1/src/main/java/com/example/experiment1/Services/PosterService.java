package com.example.experiment1.Services;

import com.example.experiment1.domain.Poster;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface PosterService {

  List<Poster> getAllPosters();
  Poster getPoster(int id);
  void addPoster(Poster poster);
  void modifyPoster(Poster poster);
  void deletePoster(int id);

}
