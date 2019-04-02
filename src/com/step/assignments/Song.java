package com.step.assignments;

public class Song {

    private String title;
    private String duration;

    public Song(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getSongDetail(){
        return String.format("Title of song = %s\nDuration = %s", title, duration);
    }
}
