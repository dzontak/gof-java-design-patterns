package com.learn.patterns.behaivoral.interator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

  public static void main(String[] args) {

    BikeRepository repo = new BikeRepository();
    repo.addBike("Cervelo");
    repo.addBike("Scott");
    repo.addBike("Cineli");

    for (String bike : repo) {
      System.out.println(bike);
    }

    List<String> bikes = new ArrayList<>();
    bikes.add("Fuji");
    bikes.add("Cineli");

      ListIterator<String> stringListIterator = bikes.listIterator();

      while(stringListIterator.hasNext()) {
          String next = stringListIterator.next();
          System.out.println(next);
          stringListIterator.remove();
      }

    System.out.println("bikes size " + bikes.size());
  }
}
