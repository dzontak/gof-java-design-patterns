package com.learn.patterns.structural.facade;

public class DBSingleton {

  private static DBSingleton instance;

  private DBSingleton() {}

  public static DBSingleton getInstance() {
    if (instance == null) {
      synchronized (DBSingleton.class) {
        if (instance == null) {
          instance = new DBSingleton();
        }
      }
    }
    return instance;
  }
}
