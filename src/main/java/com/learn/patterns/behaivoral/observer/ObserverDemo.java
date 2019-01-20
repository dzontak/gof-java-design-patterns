package com.learn.patterns.behaivoral.observer;

public class ObserverDemo {
  public static void main(String[] args) {
    Subject subject = new MessageStream();
    PhoneClient phoneClient = new PhoneClient(subject);
    TabletClient tabletClient = new TabletClient(subject);
    phoneClient.addMessage("I am a phone ");
    tabletClient.addMessage("I am a tablet");
  }
}
