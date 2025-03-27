package com.viniciustaroco.maratonajava.javacore.Bintroductionmethods.test;

import com.viniciustaroco.maratonajava.javacore.Bintroductionmethods.domain.PrintStudent;
import com.viniciustaroco.maratonajava.javacore.Bintroductionmethods.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        PrintStudent printStudent = new PrintStudent();

        student01.name = "Midoriya";
        student01.age = 15;
        student01.gender = 'M';

        student02.name = "Sakura";
        student02.age = 16;
        student02.gender = 'F';

        printStudent.print(student01);

        System.out.println("---------------------------------");

        printStudent.print(student02);

    }
}
