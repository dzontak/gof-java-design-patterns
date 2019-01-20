package com.learn.patterns.behaivoral.state;

public class FanHighState extends State {
  public FanHighState(Fan fan) {
    this.fan = fan;
  }

  @Override
  void handleRequest() {
    System.out.println("Fan set to Off");
    this.fan.setState(fan.getFanOffState());
  }

  @Override
  public String toString() {
    return "Fan is on High";
  }
}
