package com.kodluyoruz.hafta4.interfaceExample.animal;

public class Cat implements Animal {

    public void sound() {
        System.out.println("Miyav");
    }

    @Override
    public void sleep() {
        System.out.println("zZzZzZ");
    }

    public void run(){
        System.out.println("Run");
    }

}
