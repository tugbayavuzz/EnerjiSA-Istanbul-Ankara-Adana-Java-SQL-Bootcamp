package com.kodluyoruz.hafta4.interfaceExample;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.takeExams();

        //bir interfaceden nesne olusturulmaz!!!
        //CourseMember courseMember = new CourseMember();
        //'CourseMember' is abstract; cannot be instantiated

        //abstract sınıflarında hem soyut hem normal metot oluşturabiliyor
        //Interfacelerde abstractlardaki gibi metot oluşturamayız
        //sınıflara uygulamak istersek implements kullanıyoruz
        //bir interfaceden bir interface alınacaksa extends kullanırız
    }
}
