package com.learn.patterns.behaivoral.command;

public class Light {

  private boolean isOn = Boolean.FALSE;

  public void on() {
    this.isOn = true;
    System.out.println("Light switched On");
  }

  public void off() {
    this.isOn = false;
      System.out.println("Light switched Off");
  }

  public boolean isOn() {
      return this.isOn;
  }

  public void toggle() {
      if(isOn) {
          off();
      } else {
          on();
      }
  }
}
