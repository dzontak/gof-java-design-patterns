package com.learn.patterns.behaivoral.chainofresponsibility;


public abstract class Handler {
  private Handler successor;

  public void setSuccessor(Handler successor) {
    this.successor = successor;
  }


  public Handler getSuccessor() {
    return this.successor;
  }

  public abstract void handleRequest(Request request);
}
