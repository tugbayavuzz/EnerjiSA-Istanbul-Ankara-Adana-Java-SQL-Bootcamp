package com.kodluyoruz.hafta4.interfaceExample.animal;

public class MainAnimal {
    public static void main(String[] args) {
        //Animal object = new Animal(); //soyut sınıfından nesne türetemezsin
        //Cat cat = new Cat();
        Animal object1 = new Cat();
        // object1.sound();
        object1.sleep();
        object1.sound();
        object1.run();

        Dog dog = new Dog();
        dog.run();
    }
}
