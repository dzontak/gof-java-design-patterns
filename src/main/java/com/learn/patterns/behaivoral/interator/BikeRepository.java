package com.learn.patterns.behaivoral.interator;

import java.util.Iterator;

public class BikeRepository implements Iterable<String> {

  private String[] bikes;
  private int index;

  public BikeRepository() {
    bikes = new String[10];
    index = 0;
  }

  public void addBike(String bike) {
    if (index == bikes.length) {
      String[] largerBikes = new String[bikes.length + 5];
      System.arraycopy(bike, 0, largerBikes, 0, bike.length());
      bikes = largerBikes;
      largerBikes = null;
    }
    bikes[index++] = bike;
  }

  public Iterator<String> iterator() {

    return new Iterator<String>() {
      int currentIndex = 0;

      @Override
      public boolean hasNext() {
        return currentIndex < bikes.length && bikes[currentIndex] != null;
      }

      @Override
      public String next() {
        return bikes[currentIndex++];
      }
    };
  }
}
