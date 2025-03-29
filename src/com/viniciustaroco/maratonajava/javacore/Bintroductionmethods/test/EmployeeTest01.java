package com.viniciustaroco.maratonajava.javacore.Bintroductionmethods.test;

import com.viniciustaroco.maratonajava.javacore.Bintroductionmethods.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        double[] salaries = {1735, 2223, 2455};
        employee.name = "Vinicius";
        employee.age = 22;
        employee.allSalaries = salaries;
        employee.printer();

    }
}
