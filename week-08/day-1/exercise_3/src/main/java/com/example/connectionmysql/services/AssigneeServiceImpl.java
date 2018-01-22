package com.example.connectionmysql.services;

import com.example.connectionmysql.models.Assignee;
import com.example.connectionmysql.repository.AssigneeRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssigneeServiceImpl implements AssigneeService {

  @Autowired
  AssigneeRepo assigneeRepository;

  @Override
  public List<Assignee> getAllAssignees() {
    List<Assignee> assignees;
    assignees = (List<Assignee>) assigneeRepository.findAll();
    return assignees;
  }

  @Override
  public Assignee getAssignee(int id) {
    Assignee assignee;
    assignee = assigneeRepository.findOne(id);
    return assignee;

  }

  @Override
  public void modifyAssignee(Assignee assignee) {
    assigneeRepository.save(assignee);
  }

  @Override
  public void create(Assignee assignee) {
    assigneeRepository.save(assignee);
  }

  @Override
  public void delete(int id) {
    assigneeRepository.delete(id);
  }
}
