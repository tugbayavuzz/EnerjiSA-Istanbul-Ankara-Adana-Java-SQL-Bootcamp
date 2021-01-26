package com.kodluyoruz.hafta4;

public class Circle {
    //genellikle dışarıdan erişilmesini istemediğimiz için private yaptık
    private double radius;
    private String color; //private diyerek encapsulationdır aslında bu

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



}
