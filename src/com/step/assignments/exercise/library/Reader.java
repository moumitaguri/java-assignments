package com.step.assignments.exercise.library;

import java.util.HashSet;


public class Reader {

    //todo reader should not have access on library
    private HashSet<Book> bookList;
    private String name;

    public Reader(String name) {
        this.name = name;
        this.bookList = new HashSet<>();

    }

//    public boolean isPresent(Book book, Library library) {
//        return library.getBookList().containsValue(book);
//    }
//
//    public boolean validReader(Library library) {
//        return library.getReaderIds().contains(name);
//    }

//    public Book search(Book book) {
//        if (!validReader(library)) {
//            System.out.println("you are not a reader of this library...");
//            return null;
//        }
//        if (!isPresent(book, library)) {
//            System.out.println("This book is not present...");
//            return null;
//        }
//        System.out.println("you are looking for this book\n");
//        return book;

//    }

    public void borrow(Book book) {
        this.bookList.add(book);
    }

    //todo i should check if given book I have or not
    public boolean hasBorrowed() {
        return !getBookList().isEmpty();
    }

    public void returnBook(Book book) {
        this.bookList.remove(book);

    }

    public HashSet<Book> getBookList() {
        return new HashSet<>(bookList);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", bookList=" + bookList +
                '}';
    }
}
