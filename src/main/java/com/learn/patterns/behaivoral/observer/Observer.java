package com.learn.patterns.behaivoral.observer;

public abstract class Observer {
  Subject subject;

  abstract void update();

  public void addMessage(String message) {
    subject.setState(message);
  }
}
