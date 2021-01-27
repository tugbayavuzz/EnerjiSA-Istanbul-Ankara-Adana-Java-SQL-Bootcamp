package com.kodluyoruz.hafta4.sports;

public class Stadium implements Hockey, Football {
    private String stadiumHomeTeam;
    @Override
    public void homeTeamScored(int point) {
        System.out.println(point);

    }

    @Override
    public void visitingTeamScored(int point) {
        System.out.println(point);
    }

    @Override
    public void overtimePeriod(int overtimePeriod) {
        System.out.println(overtimePeriod);
    }

    @Override
    public void endOfPeriod(int endOfPeriod) {
        System.out.println(endOfPeriod);

    }

    @Override
    public void setHomeTeam(String name) {
        this.stadiumHomeTeam= name;
    }

    @Override
    public void setVisitingTeam(String name) {
        System.out.println(name);

    }
    public String getHomeTeam(){
        return stadiumHomeTeam;
    }

}
