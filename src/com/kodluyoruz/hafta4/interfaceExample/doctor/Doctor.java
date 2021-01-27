package com.kodluyoruz.hafta4.interfaceExample.doctor;

public class Doctor {
    private String name;
    private int age;
    private String branch;

    //constructor
    public Doctor() {
        this.name = "Doctor's Name";
        this.branch="Doctor's Branch";
    }

    public Doctor(String doctorName){
        this.name=doctorName;
    }
    public Doctor(String doctorName, int doctorAge, String doctorBranch) {
        this.name = doctorName;
        this.age = doctorAge;
        this.branch = doctorBranch;
    }

    void getDoctorInfo() {
        System.out.println("Doctor's Information");
        System.out.println("Doctor's Name: " + name);
        System.out.println("Doctor's Age: " + age);
        System.out.println("Doctor's Branch: " + branch);

    }
}
