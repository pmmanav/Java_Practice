package inheritence;

public class InheritanceChecker {
    public static void main(String[] args) {
        Person person =  new Person();
        // Employee object makes a call to super class (Person) connstructor before executing its constructor. 
        Employee employee = new Employee();
    }
}
