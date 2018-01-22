package com.example.experiment1.Services;

import com.example.experiment1.domain.Poster;
import com.example.experiment1.repositories.PosterRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PosterServiceImpl implements PosterService {

  @Autowired
  PosterRepository posterRepository;

  @Override
  public List<Poster> getAllPosters() {
    List<Poster> posters;
    posters = (List<Poster>) posterRepository.findAll();
    return posters;
  }

  @Override
  public Poster getPoster(int id) {
    return posterRepository.findOne(id);
  }

  @Override
  public void addPoster(Poster poster) {
    posterRepository.save(poster);
  }

  @Override
  public void modifyPoster(Poster poster) {
    posterRepository.save(poster);
  }

  @Override
  public void deletePoster(int id) {
    posterRepository.delete(id);
  }
}
