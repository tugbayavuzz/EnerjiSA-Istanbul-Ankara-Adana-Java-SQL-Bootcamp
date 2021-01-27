package com.kodluyoruz.hafta4.interfaceExample.doctor;

public class DoctorMain {
    public static void main(String[] args) {

        Dentist dentist = new Dentist("Tugba");
        // Doctor doctor = new Doctor(doctorName,doctorAge);Cannot resolve symbol 'doctorAge'
        //Üst sınıfı alt sınıfa dönüştüremezsin

        Dentist doctor = new Dentist("Yavuz");
        doctor.getDentistInfo();
        System.out.println("----------------------");
        dentist.getDentistInfo();

        Doctor doctor1 = new Doctor("tugba",25,"Heart");
        //System.out.println(doctor1.name);
        //'name' has private access in 'com.kodluyoruz.hafta4.interfaceExample.doctor.Doctor
        System.out.println(doctor1.getDoctorName());

    }
}
/*
----super---
üst sınıf metotlarına ve ozelliklerine ulaşmak için kullanıyoruz
constructor ile kullanabiliriz


 */