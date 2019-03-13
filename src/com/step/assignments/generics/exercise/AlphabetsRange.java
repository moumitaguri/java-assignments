package com.step.assignments.generics.exercise;

import java.util.ArrayList;

public class AlphabetsRange extends Range<Character> {

    private ArrayList<Character> alphabets;

    public AlphabetsRange(Character start, Character end) {
        super(start, end);
        this.alphabets = this.createElements();
    }

    private ArrayList<Character> createElements() {

        ArrayList<Character> alphabets = new ArrayList<>();

        for (char alphabet = start; alphabet <= end; alphabet++) {

           alphabets.add(alphabet);

        }
        return alphabets;
    }

    @Override
    ArrayList<Character> getAll() {
        return alphabets;
    }

    @Override
    boolean containsElement(Character element) {
        return element >= start && element <= end;
    }
}
