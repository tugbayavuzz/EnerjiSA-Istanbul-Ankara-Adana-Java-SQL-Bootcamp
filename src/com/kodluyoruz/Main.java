package com.kodluyoruz;

public class Main {

    public static void main(String[] args) {
        int sayi1 =700; //32 bit
        long sayi2 = 19983; //64 bit
        short sayi3 = 23;//16 bit
        byte sayi4 = 10;//8 bit
        float ondalikliSayi = 14.5F;//32 bit
        double ondalikliSayi2 = 14.5;//64 bit
        char harf = 'a';//16 bit;
        String harfler = "Merhaba Kodluyoruz";
        boolean harfVarmi = false;

        //References Types
        //Classes, Interfaces,Arrays
        System.out.println(
                sayi1   +"\n"
                + sayi2 +"\n"
                + sayi3 +"\n"
                + sayi4 +"\n"
                + ondalikliSayi +"\n"
                + ondalikliSayi2 +"\n"
                + harf +"\n"
                + harfler +"\n"
                + harfVarmi);
    }
}
