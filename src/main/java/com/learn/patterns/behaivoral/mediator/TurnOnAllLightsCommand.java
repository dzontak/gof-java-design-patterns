package com.learn.patterns.behaivoral.mediator;

public class TurnOnAllLightsCommand implements Command {
  private final Mediator mediator;

  public TurnOnAllLightsCommand(Mediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void execute() {
    this.mediator.turnOnAllLights();
  }
}
