package com.viniciustaroco.maratonajava.javacore.Aintroductionclasses.test;

import com.viniciustaroco.maratonajava.javacore.Aintroductionclasses.domain.Teacher;

public class TeacherTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.nameTeacher = "Marcos";
        teacher.ageTeacher = 48;
        teacher.genderProfessor = 'M';
        System.out.println("Name: " + teacher.nameTeacher + "\nAge: " + teacher.ageTeacher + "\nGender: " + teacher.genderProfessor);
    }
}
