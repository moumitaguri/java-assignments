package com.step.assignments;

public class IntEqualityPrinter {
    public static void main(String[] args) {
        printEqual(1,1,1);
        printEqual(1,2,1);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);

    }

    public static void printEqual(int firstNum, int secondNum, int thirdNum) {
        if(lessThanZero(firstNum) || lessThanZero(secondNum) || lessThanZero(thirdNum)){
            System.out.println("Invalid Value");
            return;
        }
        if(equal(firstNum,secondNum) && equal(firstNum,thirdNum)){
            System.out.println("All numbers are equal");
            return;
        }
        if(!equal(firstNum,secondNum) && !equal(firstNum,thirdNum)){
            System.out.println("All numbers are different");
            return;
        }
        System.out.println("Neither all are equal nor different");


    }

    public static boolean lessThanZero(int num) {
        return num < 0;
    }

    public static boolean equal(int num1, int num2) {
        return num1 == num2;
    }
}
