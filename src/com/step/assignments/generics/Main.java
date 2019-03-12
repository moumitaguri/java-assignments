package com.step.assignments.generics;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {

        FootballTeam indXiF = new FootballTeam("IND XI F", 1, 2, 3);
        FootballTeam ausXiF = new FootballTeam("AUS XI F", 2, 2, 0);
        FootballTeam rsaXiF = new FootballTeam("RSA XI F", 1, 1, 1);

        LeagueTable<FootballTeam> footballTeamLeagueTable = new LeagueTable<>(asList(indXiF,ausXiF,rsaXiF));

        System.out.println("Football League Table ...........");
        footballTeamLeagueTable.sort();

        CricketTeam indXiC = new CricketTeam("IND XI C", 1, 2, 3);
        CricketTeam ausXiC = new CricketTeam("AUS XI C", 2, 2, 0);
        CricketTeam rsaXiC = new CricketTeam("RSA XI C", 1, 1, 1);

        LeagueTable<CricketTeam> cricketLeague= new LeagueTable<>(asList(indXiC,ausXiC,rsaXiC));

        System.out.println("Cricket League Table ...........");

        cricketLeague.sort();


    }
}
