package com.kodluyoruz;

public class Methods {

    static Integer sayi =10;

    public static void main(String[] args) {

        String yazi ="Merhaba Kodluyoruz";

        int sum2= toplam(10,20);
        int sum3= toplam(10,20,30);
        double sum4= toplam(10.5,20.5,30.0);



        ekranaYazdir(String.valueOf(sum2));
    }

    private static void ekranaYazdir(String yazi) {
        System.out.println(yazi);
    }

    private static int toplam(int x, int y){
        int toplam = x+y;
        return toplam;
    }
    private static int toplam(int x,int y,int z){
        int toplam =x+y+z;
        return toplam;
    }
    private static double toplam(double x,double y,double z){
        double toplam =x+y+z;
        return toplam;
    }

}

