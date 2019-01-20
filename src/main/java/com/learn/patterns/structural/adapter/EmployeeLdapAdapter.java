package com.learn.patterns.structural.adapter;

public class EmployeeLdapAdapter implements Employee {

  private final EmployeeLdap employee;

  public EmployeeLdapAdapter(EmployeeLdap employeeLdap) {
    this.employee = employeeLdap;
  }

  @Override
  public long getId() {
    return Long.parseLong(this.employee.getCn());
  }

  @Override
  public String getFirstName() {
    return this.employee.getGivenName();
  }

  @Override
  public String getLastName() {
    return this.employee.getSurname();
  }

  @Override
  public String getEmail() {
    return this.employee.getMail();
  }

  @Override
  public String toString() {
    return "EmployeeLdapAdapter{" +
            "id=" + getId() +
            ", firstName='" + getFirstName() + '\'' +
            ", lastName='" + getLastName() + '\'' +
            ", email='" + getEmail() + '\'' +
            '}';
  }

}
