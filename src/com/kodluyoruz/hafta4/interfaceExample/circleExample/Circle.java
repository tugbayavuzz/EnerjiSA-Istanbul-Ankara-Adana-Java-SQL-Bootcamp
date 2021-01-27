package com.kodluyoruz.hafta4.interfaceExample.circleExample;

import static java.lang.Math.PI;

public class Circle {
    //genellikle dışarıdan erişilmesini istemediğimiz için private yaptık
    private double radius;
    private String color; //private diyerek encapsulationdır aslında bu
    double area;

    //constructorları tanımlarken sınıfın kedni ismiyle aynı olmalı
    //cunku o sınıfın varsayılan degerlerini temsil ediyor.
    public Circle() {
        radius = 2.0;
        color = "lila";
    }

    //bir sınıfın birden fazla yapıcı metodu olabilir
    public Circle(double r, String c) { //parametreli constructor
        radius = r;
        color = c;
    }

    public Circle(double r) {
        radius = r;
        color = "green";
    }

    //yaricapi getirmek istiyoruz
    public double getRadius() {
        return radius;
    }

    //degerinin disaridan degistirilebilir olmasını istersek setlemek gerekir
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius * radius * PI;
    }
    public double getArea(double r){
        return r*r*PI;
    }
}
