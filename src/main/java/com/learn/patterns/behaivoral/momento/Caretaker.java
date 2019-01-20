package com.learn.patterns.behaivoral.momento;

import java.util.Stack;

public class Caretaker {

  private Stack<EmployeeMomento> history = new Stack<>();

  public void save(Employee employee) {
    history.push(employee.save());
  }

  public void revert(Employee employee) {
    if (!history.isEmpty()) {
      employee.revert(history.pop());
    }
  }
}
