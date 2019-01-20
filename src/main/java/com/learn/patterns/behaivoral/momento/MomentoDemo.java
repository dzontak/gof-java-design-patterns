package com.learn.patterns.behaivoral.momento;

public class MomentoDemo {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Employee employee = new Employee("Sam Smith", "123 Main st, New York, NY 11100", "555-5555");
        System.out.println("Original number: " + employee.getPhoneNumber());
        caretaker.save(employee);
        employee.setPhoneNumber("212-333-3999");
        caretaker.save(employee);
        System.out.println("changed number " + employee.getPhoneNumber());
        caretaker.revert(employee);
        System.out.println("Revering to previous " + employee.getPhoneNumber());
        employee.setPhoneNumber("718-333-8888");
        // not calling save
        caretaker.revert(employee);
        System.out.println("Original number " + employee.getPhoneNumber());







    }
}
