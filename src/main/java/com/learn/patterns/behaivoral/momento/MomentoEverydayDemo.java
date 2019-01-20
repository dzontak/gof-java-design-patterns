package com.learn.patterns.behaivoral.momento;

import java.io.*;

public class MomentoEverydayDemo {
  public static void main(String args[]) {
    Employee employee = new Employee("Sam Smith", "123 Main st, New York, NY 11100", "555-5555");
    System.out.println(employee.hashCode());
    System.out.println(employee);
    serialze(employee);

    Employee deserialize = deserialize("employee.ser");
    System.out.println(deserialize.hashCode());
    System.out.println(deserialize);
  }

  public static void serialze(Employee employee) {
    try (FileOutputStream fos = new FileOutputStream("employee.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos)) {
      oos.writeObject(employee);

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static  Employee deserialize(String filename) {

    try (FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis)) {

      return (Employee) ois.readObject();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    return null;
  }
}
