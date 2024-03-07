package oop.car;

public abstract class Vehicle {
    abstract void move();
    abstract void stop();

    public boolean safety(boolean safe) {
        return safe;
    }
}
