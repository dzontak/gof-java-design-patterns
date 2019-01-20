package com.learn.patterns.behaivoral.command;

/**
 * Invoker of the command
 */
public class Switch {

  public void storeAndExecute(Command onCommand) {
    onCommand.execute();
  }
}
