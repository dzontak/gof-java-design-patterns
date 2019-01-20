package com.learn.patterns.behaivoral.chainofresponsibility;

public class Director extends Handler {

  @Override
  public void handleRequest(Request request) {
    if (request.getRequestType() == RequestType.CONFERENCE) {
      System.out.println("Director can approve confrences");
    } else {
      getSuccessor().handleRequest(request);
    }
  }
}
