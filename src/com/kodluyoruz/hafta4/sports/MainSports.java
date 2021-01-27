package com.kodluyoruz.hafta4.sports;

public class MainSports {
    public static void main(String[] args) {
        Stadium stadium = new Stadium();
        stadium.setHomeTeam("Kodluyoruz");
        String stadiumHomeTeamName = stadium.getHomeTeam();
        System.out.println(stadiumHomeTeamName);
    }
}
