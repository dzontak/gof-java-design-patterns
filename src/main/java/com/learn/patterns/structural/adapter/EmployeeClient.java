package com.learn.patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
  public List<Employee> getEmployeeList() {
    List<Employee> employees = new ArrayList<>();
    employees.add(new EmployeeDB(111111, "Sam", "Smith", "sam@gmail.com"));

    Employee employeFromLdap =
        new EmployeeLdapAdapter(new EmployeeLdap("122131", "Robinson", "Jack", "jack@gmail.com"));

    employees.add(employeFromLdap);

    EmployeeCSV employeeCSV = new EmployeeCSV("323,Sherlock,Holmes,sherloc@bakerstreet.com");

    employees.add(new EmployeeCsvAdapter(employeeCSV));

    return employees;
  }
}
