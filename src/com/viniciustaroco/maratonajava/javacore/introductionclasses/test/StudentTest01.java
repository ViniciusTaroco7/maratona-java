package com.viniciustaroco.maratonajava.javacore.introductionclasses.test;

import com.viniciustaroco.maratonajava.javacore.introductionclasses.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Vinicius";
        student.age = 22;
        student.gender = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
    }
}
