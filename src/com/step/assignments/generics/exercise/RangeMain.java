package com.step.assignments.generics.exercise;

public class RangeMain {
    public static void main(String[] args) {

        NumberRange numberRange = new NumberRange(1, 10);
        System.out.println("numberRange.getAll() = " + numberRange.getAll());
        System.out.println("numberRange.containsElement(5) = " + numberRange.containsElement(5));
        System.out.println("numberRange.containsElement(102) = " + numberRange.containsElement(102));

        AlphabetsRange alphabetsRange = new AlphabetsRange('a', 'z');
        System.out.println("alphabetsRange.getAll() = " + alphabetsRange.getAll());
        System.out.println("alphabetsRange.containsElement(a) = " + alphabetsRange.containsElement('b'));

        AlphabetsRange alphabetsRange1 = new AlphabetsRange('m', 's');
        System.out.println("alphabetsRange1.getAll() = " + alphabetsRange1.getAll());
        System.out.println("alphabetsRange1.containsElement('p') = " + alphabetsRange1.containsElement('p'));
        System.out.println("alphabetsRange1.containsElement('v') = " + alphabetsRange1.containsElement('v'));
    }
}
