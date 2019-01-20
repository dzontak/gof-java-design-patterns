package com.learn.patterns.behaivoral.momento;

import java.io.Serializable;

// Originator
public class Employee implements Serializable {

  private String name;
  private String address;
  private String phoneNumber;

  public Employee(String name, String address, String phoneNumber) {
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public EmployeeMomento save() {
    return new EmployeeMomento(this.name, this.phoneNumber);
  }

  public void revert(EmployeeMomento momento) {
    this.name = momento.getName();
    this.phoneNumber = momento.getPhone();
  }

  @Override
  public String toString() {
    return "Employee{"
        + "name='"
        + name
        + '\''
        + ", address='"
        + address
        + '\''
        + ", phoneNumber='"
        + phoneNumber
        + '\''
        + '}';
  }
}
