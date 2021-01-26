package com.kodluyoruz.hafta4;


public class MainCircle {
    public static void main(String[] args) {
        Circle object1 = new Circle(); //circle da olan radius ve lila özelliklerine sahip olmus oldu
        Circle object2 = new Circle(4.0, "red");
        Circle object3 = new Circle(5.0);

        double object = object1.getRadius();
        System.out.println("1.Object Radius: "+object);
        System.out.println("1.Object Color: "+object1.getColor());
        System.out.println("1.Object Area: "+ object1.getArea());
    }
}
