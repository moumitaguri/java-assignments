package com.step.assignments.generics;

import java.util.Comparator;
import java.util.List;

public class LeagueTable<T extends Team> {

    private List<T> teams;

    public LeagueTable(List<T> teams) {
        this.teams = teams;
    }

    public LeagueTable() {
    }

    public void addTeam(T team){
        teams.add(team);
    }

    public void sort(){
        teams.sort(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o2.compareWithOtherTeam(o1);
            }
        });

        for (Team team : teams) {

            System.out.println(team.getName());

        }
    }
}
