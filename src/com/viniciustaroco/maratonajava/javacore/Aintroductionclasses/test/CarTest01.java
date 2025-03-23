package com.viniciustaroco.maratonajava.javacore.Aintroductionclasses.test;

import com.viniciustaroco.maratonajava.javacore.Aintroductionclasses.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.nameCar = "Toyota Corolla";
        car1.modelCar = "Compact Sedan";
        car1.yearCar = 1966;

        car2.nameCar = "Ford Mustang";
        car2.modelCar = "Muscle Car";
        car2.yearCar = 1964;

        System.out.println("Name: " + car1.nameCar + "\nModel: " + car1.modelCar + "\nYear: " + car1.yearCar);
        System.out.println("--------------------");
        System.out.println("Name: " + car2.nameCar + "\nModel: " + car2.modelCar + "\nYear: " + car2.yearCar);

    }
}
