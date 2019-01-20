package com.learn.patterns.structural.adapter;

public class EmployeeCSV {

  private int id;
  private String first;
  private String last;
  private String emailAddress;

  public EmployeeCSV(String employeeCsv) {

    String[] emp = employeeCsv.split(",");
    this.id = Integer.parseInt(emp[0]);
    this.first = emp[1];
    this.last = emp[2];
    this.emailAddress = emp[3];
  }

  public int getId() {
    return id;
  }

  public String getFirst() {
    return first;
  }

  public String getLast() {
    return last;
  }

  public String getEmailAddress() {
    return emailAddress;
  }
}
