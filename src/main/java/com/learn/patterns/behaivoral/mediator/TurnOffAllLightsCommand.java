package com.learn.patterns.behaivoral.mediator;

public class TurnOffAllLightsCommand implements Command {

  private final Mediator mediator;

  public TurnOffAllLightsCommand(Mediator mediator) {
      this.mediator = mediator;

  }

  @Override
  public void execute() {
    mediator.turnOffAllLights();
  }
}
