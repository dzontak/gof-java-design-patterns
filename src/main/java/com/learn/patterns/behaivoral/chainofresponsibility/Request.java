package com.learn.patterns.behaivoral.chainofresponsibility;

public class Request {
  private int amount;
  private RequestType requestType;

  public Request(RequestType requestType, int amount) {
    this.requestType = requestType;
    this.amount = amount;
  }

  public int getAmount() {
    return amount;
  }

  public RequestType getRequestType() {
    return requestType;
  }
}
