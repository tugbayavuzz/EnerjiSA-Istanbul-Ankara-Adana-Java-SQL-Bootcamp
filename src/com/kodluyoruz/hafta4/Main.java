package com.kodluyoruz.hafta4;

public class Main {

    public static void main(String[] args) {
        //Animal object = new Animal(); //soyut sınıfından nesne türetemezsin
        //Cat cat = new Cat();
        Animal object1 = new Cat();
        // object1.sound();
        object1.sleep();
    }
}

interface InterfaceName {
    //abstract methods
}

class Student implements SchoolMember,CourseMember{
    @Override
    public void exams() {
        System.out.println("student takes the exam");
    }

    @Override
    public void certificate() {
        System.out.println("student gets a certificate");
    }
}

interface SchoolMember {
        //soyut method tanımlanabilir olduğu için abstract yazmaya gerek yok
        public void exams();

}

interface CourseMember {
        public void certificate();
}