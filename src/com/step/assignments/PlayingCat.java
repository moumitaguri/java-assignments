package com.step.assignments;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(isCatPlaying(true,45));

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if(isSummer(summer) && !inSummerRange(temperature)){
            return false;
        }
        if(!isSummer(summer) && !inRange(temperature)){
            return false;
        }
        return true;
    }

    public static boolean inSummerRange(int temperature) {
        return temperature >= 25 && temperature <= 45;
    }

    public static boolean inRange(int temperature){
        return temperature >= 25 && temperature <= 35;
    }
    public static boolean isSummer(boolean summer){
        return summer == true;
    }
}
