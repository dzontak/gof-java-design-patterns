package com.learn.patterns.behaivoral.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverEverydayDemo {
  public static void main(String[] args) {
    TwitterStream messageStream = new TwitterStream();
    // observers to receive tweets
    Client client1 = new Client("Brian");
    Client client2 = new Client("Mark");
    messageStream.addObserver(client1);
    messageStream.addObserver(client2);
    messageStream.someoneTweeted("Tweet 1");
  }

  private static class TwitterStream extends Observable {

    public void someoneTweeted(String tweet) {
      setChanged();
      notifyObservers(tweet);
    }
  }

  private static class Client implements Observer {

    private final String name;

    public Client(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return "Client{" + "name='" + name + '\'' + '}';
    }

    @Override
    public void update(Observable o, Object arg) {
      System.out.println(this.name + " received tweet : " +  arg);
    }
  }
}
