package com.step.assignments.exercise.library;

public class Book {

    //todo bookId should be in constructor
    private String title;
//    private String author;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
//                ", author='" + author + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }
}
