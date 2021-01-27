package com.kodluyoruz.hafta4.interfaceExample;

public class Dog implements Animal, Runnable {
    @Override
    public void sound() {
        System.out.println("Dog sounds");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }

    @Override
    public void run() {
        System.out.println("Dog runs");
    }
}

/*
public class ABankPaymentSystem implements  CreditCart,Check{
    burda kredi kartı için bir yapı oluşturuldu.
    Daha sonra baska bir odeme sistemi geliştirildi  diyelim. Sadece o yapı için gerekli özelliği tanımlamak yeterli olacaktır.
    Hem de daha dinamik bir yapı olmuş oldu
}


 */