package com.kodluyoruz.hafta4.interfaceExample.doctor;

public class Dentist extends Doctor {

    private String userName;

    public Dentist() {
        this.userName = "Dentist's Name ";
    }

    public Dentist(String dentistUserName) {
        this.userName = dentistUserName;
    }

    void getDentistInfo() {
        System.out.println("Dentist's Information: ");
        System.out.println("Dentist's Name: Dt. " + userName);
        super.getDoctorInfo();


    }

}
