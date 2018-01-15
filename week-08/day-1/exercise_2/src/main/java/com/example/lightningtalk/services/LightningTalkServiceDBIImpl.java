package com.example.lightningtalk.services;

import com.example.lightningtalk.models.LightningTalk;
import com.example.lightningtalk.repositories.LightningTalkRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LightningTalkServiceDBIImpl implements LightningTalkService {

  @Autowired
  LightningTalkRepository talksRepository;

  @Override
  public List<LightningTalk> getAllTalks() {
    List<LightningTalk> talks = new ArrayList<>();
    talksRepository.findAll().forEach(talks::add);
    return talks;
  }

  @Override
  public LightningTalk getTalk(int id) {
    return talksRepository.findOne(id);
  }

  @Override
  public void modifyTalk(LightningTalk talk) {
    talksRepository.save(talk);
  }

  @Override
  public void create(LightningTalk talk) {
    talksRepository.save(talk);
  }

  @Override
  public void postpone(int id, String newDate) {
    LightningTalk talk = talksRepository.findOne(id);
    talk.setDate(newDate);
    talksRepository.save(talk);
  }

  @Override
  public void delete(int id) {
    talksRepository.delete(id);
  }
}

