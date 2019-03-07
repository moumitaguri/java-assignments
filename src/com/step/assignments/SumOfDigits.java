package com.step.assignments;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(-2));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(1532));
        System.out.println(sumDigits(1237));
    }

    public static int sumDigits(int number) {

        if(number < 10){
            return -1;      //invalid value less than 10 or negative number
        }

        int sumOfDigits = 0;

        while(number != 0){

         int remainder = number % 10;
         number = number / 10;
         sumOfDigits += remainder;

        }

        return sumOfDigits;

    }
}
