package com.learn.patterns.behaivoral.chainofresponsibility;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChanOfResponsibilityEverydayDemo {

  private static final Logger log =
      Logger.getLogger(ChanOfResponsibilityEverydayDemo.class.getName());

  public static void main(String[] args) {
    log.setLevel(Level.FINER);
    ConsoleHandler handler = new ConsoleHandler();
    handler.setLevel(Level.FINER);
    log.addHandler(handler);

    log.finest("Finest");
    log.finer("Finer");
    log.fine("Fine");
  }
}
