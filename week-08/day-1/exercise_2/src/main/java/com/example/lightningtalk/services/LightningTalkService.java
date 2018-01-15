package com.example.lightningtalk.services;

import com.example.lightningtalk.models.LightningTalk;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface LightningTalkService {

  List<LightningTalk> getAllTalks();
  LightningTalk getTalk(int id);
  void modifyTalk(LightningTalk talk);
  void create(LightningTalk talk);
  void postpone(int id, String newDate);
  void delete(int id);

}
