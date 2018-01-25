package com.example.firstproject.models;

import java.util.List;

public class Logs {

  List<Log> logOfEvents;
  int numberOfLogs;

  public Logs(List<Log> logOfEvents, int numberOfLogs) {
    this.logOfEvents = logOfEvents;
    this.numberOfLogs = numberOfLogs;
  }

  public Logs() {
  }

  public List<Log> getLogOfEvents() {
    return logOfEvents;
  }

  public void setLogOfEvents(List<Log> logOfEvents) {
    this.logOfEvents = logOfEvents;
  }

  public int getNumberOfLogs() {
    return numberOfLogs;
  }

  public void setNumberOfLogs(int numberOfLogs) {
    this.numberOfLogs = numberOfLogs;
  }
}
