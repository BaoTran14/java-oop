package oop;

import oop.car.*;
import oop.vendor.Thaco;

public class CarExhibition {
    public static void main(String[] args) {
        String name = "Anna";
        Toyota toyota = new Toyota(1890);
//        System.out.println(toyota);
//        toyota.setBranchName("TOYOTA");
//        System.out.println("toyota branch name is " + toyota.getBranchName());
//        toyota.setCountry("JAPAN");
//        System.out.println("toyota country is " + toyota.getCountry());
//        toyota.tyre();
//        boolean safety = toyota.safety(true);
//        System.out.println("Toyota safety is " + safety);

        Car camryCar = new CamryCar(1900);
        camryCar.carColor("White");
        camryCar.carShape(CarShape.SEDAN);

        boolean test = true;
        Boolean result = false;
        boolean a = result;
        int oval = 2147483647;
        Integer odd = 2;
        float x = 1.22345678910f;
        short shortVal = 123;
//        Short;
        double y = 2323.3;
        long b = 123322222L;

//        Toyota.getObject().setCountry("JAPAN");
//        System.out.println(Toyota.getObject().getCountry());
//
//        Car toyotaCar = new Toyota(1890);
//        System.out.println(toyotaCar);
//        toyota.tyre();
//
//
//        Bmw bmw = new Bmw();
//        bmw.tyre();
//
//        Thaco thaco = new Thaco(1990);
//        thaco.setBranchName("THACO TRƯỜNG HẢI");
//        System.out.println("Thaco branch name is " + thaco.getBranchName());
//        thaco.setCountry("Việt Nam");
//        System.out.println("Thaco country is " + toyota.getCountry());
    }
}
