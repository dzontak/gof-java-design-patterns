package com.learn.patterns.behaivoral.command;

import java.util.Arrays;
import java.util.List;

public class CommandDemo {

  public static void main(final String[] args) {
      Light bedroomLight = new Light(); // Receiver
      Light kitchenLight = new Light(); // Receiver
      Light bathRoomLight = new Light(); // Receiver

      Switch lightSwich = new Switch(); // invoker
      Command toggleCommand = new ToggleCommand(bedroomLight); // Concrete Command

      lightSwich.storeAndExecute(toggleCommand);
      lightSwich.storeAndExecute(toggleCommand);

      List<Light> lights = Arrays.asList(bedroomLight, kitchenLight, bathRoomLight);
      Command allLightsCommand = new AllLightsCommand(lights);
      lightSwich.storeAndExecute(allLightsCommand);;


  }
}
