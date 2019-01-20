package com.learn.patterns.behaivoral.state;

public class FanLowState extends State {

  public FanLowState(Fan fan) {
    this.fan = fan;
  }

  @Override
  void handleRequest() {
    System.out.println("Fan set to Medium");
    this.fan.setState(fan.getFanMediumState());
  }

  @Override
  public String toString() {
    return "Fan is on Low";
  }
}
