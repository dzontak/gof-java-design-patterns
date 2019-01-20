package com.learn.patterns.behaivoral.mediator;

// receiver

public class Light {

  private boolean isOn = Boolean.FALSE;
  private String type;

    public Light(String type) {
        this.type = type;
    }

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
