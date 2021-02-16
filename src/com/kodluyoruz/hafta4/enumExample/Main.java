package com.kodluyoruz.hafta4.enumExample;

public class Main {
    public static void main(String[] args) {
        // Days day = new Days();
        // özelleşmiş sınıf türü oldugu için direkt new ile nesnet üretemeyiz
        Days day = Days.Friday;

        if (day == Days.Monday) {
            System.out.println("Bugun Pazartesidir");
        } else if (day == Days.Friday) {
            System.out.println("Bugun Cumadir");
        } else
            System.out.println("Bugun diger gunlerden biridir");
    }
}
