package com.step.assignments;

public class TeenNumberChecker {
    public static void main(String[] args) {

    }

    public static boolean hasTeen(int first,int second, int third) {
        return isTeen(first) || isTeen(second) || isTeen(third);
    }

    public static boolean isTeen(int candidate){
        return candidate >= 13 && candidate <=19;
    }
}
