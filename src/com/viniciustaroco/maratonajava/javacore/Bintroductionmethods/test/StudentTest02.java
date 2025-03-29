package com.viniciustaroco.maratonajava.javacore.Bintroductionmethods.test;

import com.viniciustaroco.maratonajava.javacore.Bintroductionmethods.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Vinicius";
        student.age = 22;
        student.gender = 'M';

        student.print();
    }
}
