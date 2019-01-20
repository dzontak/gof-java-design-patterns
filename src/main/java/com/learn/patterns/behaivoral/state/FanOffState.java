package com.learn.patterns.behaivoral.state;

public class FanOffState extends State {

  public FanOffState(Fan fan) {
    this.fan = fan;
  }

  @Override
  void handleRequest() {
    System.out.println("Turning fan LOW");
    this.fan.setState(fan.getFanLowState());
  }

  @Override
  public String toString() {
    return "Fan is Off";
  }
}
