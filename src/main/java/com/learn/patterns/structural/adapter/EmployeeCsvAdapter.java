package com.learn.patterns.structural.adapter;

public class EmployeeCsvAdapter implements Employee {
  private final EmployeeCSV employeeCSV;

  public EmployeeCsvAdapter(EmployeeCSV employeeCSV) {
    this.employeeCSV = employeeCSV;
  }

  @Override
  public long getId() {
    return Long.valueOf(employeeCSV.getId());
  }

  @Override
  public String getFirstName() {
    return employeeCSV.getFirst();
  }

  @Override
  public String getLastName() {
    return employeeCSV.getLast();
  }

  @Override
  public String getEmail() {
    return employeeCSV.getEmailAddress();
  }

  @Override
  public String toString() {
    return "EmployeeCsvAdapter{" +
            "id=" + getId() +
            ", firstName='" + getFirstName() + '\'' +
            ", lastName='" + getLastName() + '\'' +
            ", email='" + getEmail() + '\'' +
            '}';
  }
}
