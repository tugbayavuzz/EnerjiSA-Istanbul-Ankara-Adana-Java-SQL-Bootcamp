package com.kodluyoruz.hafta4.enumExample;

public enum Months {
    January(1),
    February(2),
    March(3),
    April(4),
    May(5),
    June(6),
    July(7),
    August(8),
    September(9),
    October(10),
    November(11),
    December(12);
    //dısarıdan yapıcı metot tanımlanabilir

    private int month;

    Months(int month) {
        this.month = month;
    }
    public int getMonth() {
        return month;
    }

}
