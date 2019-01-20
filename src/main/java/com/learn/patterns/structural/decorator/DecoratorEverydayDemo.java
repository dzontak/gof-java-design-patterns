package com.learn.patterns.structural.decorator;

import java.io.*;

public class DecoratorEverydayDemo {
  public static void main(String[] args) throws IOException {
    File file = new File("output.txt");
    file.createNewFile();

    try (OutputStream os = new FileOutputStream(file);
        DataOutputStream dos = new DataOutputStream(os)) {
      dos.writeChars("text");
    }
  }
}
