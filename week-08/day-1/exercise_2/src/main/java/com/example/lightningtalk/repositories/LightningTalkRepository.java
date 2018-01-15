package com.example.lightningtalk.repositories;

import com.example.lightningtalk.models.LightningTalk;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LightningTalkRepository extends CrudRepository<LightningTalk, Integer> {

}
