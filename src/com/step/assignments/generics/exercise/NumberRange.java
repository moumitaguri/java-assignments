package com.step.assignments.generics.exercise;

import java.util.ArrayList;

public class NumberRange extends Range<Integer> {

    private ArrayList<Integer> numbers;

    public NumberRange(Integer start, Integer end) {
        super(start, end);
        numbers = this.createElements();
    }

    @Override
    ArrayList<Integer> getAll() {
        return numbers;
    }

    @Override
    boolean containsElement(Integer element) {
        return element >= start && element <= end;
    }

    private ArrayList<Integer> createElements(){
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int number = super.start; number <= super.end; number++) {

            numbers.add(number);

        }
        return numbers;
    }
}
