package oop.car;

public class CamryCar extends Toyota {
    public CamryCar(int year) {
        super(year);
    }

    public void carColor(String color) {
        System.out.println("Camry color is " + color);
    }

    public void carShape(CarShape shape) {
        System.out.println("Camry shape is " + shape);
    }
}
