package com.learn.patterns.behaivoral.strategy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StrategyEverydayDemo {
  public static void main(String arg[]) {
    Person bryan = new Person("Bryan", 44, "212-555-5555");
    Person mark = new Person("Mark", 34, "212-555-4444");
    Person chris = new Person("Chris", 55, "212-555-4454");
    List<Person> persons = Arrays.asList(bryan, mark, chris);

    persons.sort(Comparator.comparingInt(Person::getAge));
    System.out.println(persons);

    persons.sort(Comparator.comparing(Person::getName, String.CASE_INSENSITIVE_ORDER));
    System.out.println(persons);
  }
}
