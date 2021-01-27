package com.kodluyoruz.hafta3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int sayi1 = 700; //32 bit
        Integer sayiA = 300;

        System.out.println(sayi1);
        System.out.println(sayiA);//sayiA ile 300 değerinin  tutulduğu yeri göster ve referans olan değeri göster

        long sayi2 = 19983; //64 bit
        short sayi3 = 23;//16 bit
        byte sayi4 = 10;//8 bit
        float ondalikliSayi = 14.5F;//32 bit
        double ondalikliSayi2 = 14.5;//64 bit
        char harf = 'a';//16 bit;
        String harfler = "Merhaba Kodluyoruz";
        boolean harfVarmi = false;


        System.out.println(
                sayi1 + "\n"
                        + sayi2 + "\n"
                        + sayi3 + "\n"
                        + sayi4 + "\n"
                        + ondalikliSayi + "\n"
                        + ondalikliSayi2 + "\n"
                        + harf + "\n"
                        + harfler + "\n"
                        + harfVarmi);

        //#################################################################################################
        for (int i = 0; i <= 10; i++) { //0 dan 10 a kadar olan sayıları ekrana yazdırma
            System.out.println(i);
        }
        //#################################################################################################
        //array liste sonradan eleman ekleyebiliyroum ve bu yüzden kesin kayıt sayısı belli olmayanlar  için kullanılır
        ArrayList<String> meyveler = new ArrayList<>();
        meyveler.add("elma"); //elma meyveler dizisine eklendi
        meyveler.add("portakal");
        meyveler.add("mandalina");
        System.out.println(meyveler); //eklenen meyve isimleri yazdırıldı


        //#################################################################################################
        //diğer bir for kullanımıyla dizinin yazdırılması
        for (String elements : meyveler) {
            System.out.println(elements);
        }


        //#################################################################################################
        String[] meyveler2 = {"elma", "armut", "erik"};//diğer bir String dizisi kullanım
        int sayac1 = 0, sayac2 = 0;

        for (String elements : meyveler2) {
            System.out.println(elements);
            System.out.println("sayac: " + sayac1++);
            System.out.println("2.sayac: " + ++sayac2);
            System.out.println("---------------------");
        }


        //#################################################################################################
        //IF Bloğu sql deki where gibi diyebiliriz.Asal olup  olmadığını kontrol eden kod
        int kalan;
        boolean asalMi = true;
        int sayi = 1;
        if (sayi == 1) {
            asalMi = false;
        } else {
            for (int i = 2; i <= sayi / 2; i++) {
                kalan = sayi % i;
                if (kalan == 0 || sayi == 1) {
                    asalMi = false;
                    break;
                }
            }
        }

        if (asalMi) {
            System.out.println(sayi + " asal bir sayıdır");
        } else
            System.out.println(sayi + " asal bir sayı değildir");

    }


}

