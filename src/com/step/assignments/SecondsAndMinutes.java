package com.step.assignments;

public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(2, 5));
        System.out.println(getDurationString(125));
        System.out.println(getDurationString(7230));
        System.out.println(getDurationString(-5,6));
        System.out.println(getDurationString(9,-3));
        System.out.println(getDurationString(9,64));
        System.out.println(getDurationString(9,9));
        System.out.println(getDurationString(61,0));
        System.out.println(getDurationString(61));
        System.out.println(getDurationString(48645900));

    }

    public static String getDurationString(int minutes, int seconds) {
        if((minutes < 0) || ((seconds < 0) || (seconds > 59))){
            return "Invalid value";
        }

        int totalSeconds = minutes * 60 + seconds;
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        minutes = remainingSeconds / 60;
        seconds = remainingSeconds%60;
        String time = hours + "h " + minutes + "m " + seconds + "s";
        return time;

    }

    public static String getDurationString(int seconds) {
        if(seconds < 0){
            return "Invalid value";
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes,remainingSeconds);
    }
}
