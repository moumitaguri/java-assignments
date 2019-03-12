package com.step.assignments.generics;

public class FootballTeam extends Team {

    public FootballTeam(String name, int matchesWon, int matchesLost, int matchesDraw) {
        super(name, matchesWon, matchesLost, matchesDraw);
    }

    @Override
    int calculatePoints() {
        return super.getMatchesWon() + super.getMatchesLost() * (-2);

    }

}
