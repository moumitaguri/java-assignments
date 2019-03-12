package com.step.assignments.generics;

public class CricketTeam extends Team {

    public CricketTeam(String name, int matchesWon, int matchesLost, int matchesDraw) {
        super(name, matchesWon, matchesLost, matchesDraw);
    }

    @Override
    int calculatePoints() {
        return getMatchesWon()*2 + super.getMatchesDraw();
    }


}
