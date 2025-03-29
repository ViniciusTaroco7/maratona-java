package com.viniciustaroco.maratonajava.javacore.Bintroductionmethods.domain;

public class Employee {
    public String name;
    public int age;
    public double[] allSalaries;

    public void printer() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        for (double printSalaries : allSalaries) {
            System.out.println("salary: " + printSalaries);
        }
        System.out.println("Salary average: " + this.returnAverageSalary());
    }

    public double returnAverageSalary() {
        double sumSalaries = 0;
        for (double salaryValue : allSalaries) {
            sumSalaries += salaryValue;
        }
        return sumSalaries /= allSalaries.length;
    }

}
