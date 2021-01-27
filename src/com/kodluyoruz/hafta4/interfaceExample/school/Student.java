package com.kodluyoruz.hafta4.interfaceExample.school;

public class Student implements SchoolMember, CourseMember {
    @Override
    public void takeExams() {
        System.out.println("student takes the exam");
    }

    @Override
    public void getCertificate() {
        System.out.println("student gets a certificate");
    }
}

