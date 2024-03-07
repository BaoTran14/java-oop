package oop.car;

public class Car extends Vehicle implements Color, Shape {
     public void tyre() {
         System.out.println("Car has tyres");
     }

    @Override
    void move() {

    }

    @Override
    void stop() {

    }

    @Override
    public void carColor(String color) {
         throw new RuntimeException("Not implemented");
    }

    @Override
    public void carShape(CarShape shape) {

    }
}
