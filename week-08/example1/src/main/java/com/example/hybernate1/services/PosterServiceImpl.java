package com.example.hybernate1.services;

import com.example.hybernate1.models.Poster;
import com.example.hybernate1.repositories.PosterRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PosterServiceImpl implements PosterService {

  @Autowired
  PosterRepo posterRepo;

  @Override
  public List<Poster> getAllPosters() {
    List<Poster> posters;
    posters = (List<Poster>) posterRepo.findAll();
    return posters;
  }

  @Override
  public Poster getPoster(int id) {
    Poster poster;
    poster = posterRepo.findOne(id);
    return poster;
  }

  @Override
  public void addPoster(Poster poster) {
    posterRepo.save(poster);
  }

  @Override
  public void deletePoster(int id) {
    posterRepo.delete(id);

  }

  @Override
  public void editPoster(Poster poster) {
    posterRepo.save(poster);
  }
}
