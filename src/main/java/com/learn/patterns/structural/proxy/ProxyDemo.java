package com.learn.patterns.structural.proxy;

public class ProxyDemo {
  public static void main(String[] args) {

    // you can substitute TwitterServiceStub with your own implementations

    TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
    System.out.println(service.getTimeline("john"));
    // this method will throw an IllegalArgument exeption becuase we don't allow posts.
    try {
      service.postToTimeline("user", "message");
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}
