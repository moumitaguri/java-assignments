package com.step.assignments.exercise.library;

import java.util.HashMap;

public class LibraryMain {

    public static void main(String[] args) {


//        Book book1 = new Book("title1", "author1");
//        Book book2 = new Book("title2", "author2");
//        Book book3 = new Book("title3", "author1");
//
//        HashMap<Integer, Book> bookList = new HashMap<>();
//
//
//        Reader reader1 = new Reader("reader1");
//        Reader reader2 = new Reader("reader2");
//        Reader reader3 = new Reader("reader3");
//        Reader reader4 = new Reader("reader4");
//
//        Librarian librarian = new Librarian("someone");
//
//        Library library = new Library(librarian);
//
//        library.addReader(reader1);
//        library.addReader(reader2);
//        library.addReader(reader3);
//        library.addReader(reader4);
//
//        System.out.println("readers are added...............\n");
//
//        library.addBook(book1, 1);
//        library.addBook(book2, 3);
//
//        System.out.println("books are added...............\n");
//
//        System.out.println("books in library....");
//        System.out.println(library.getBookList());
//
//        System.out.println(reader4.search(book1, library));
//
//        reader1.borrow(book1, library);
//
//        System.out.println("books in library....\n");
//        System.out.println(library.getBookList());
//
//        System.out.println("reader1.hasBorrowed() = " + reader1.hasBorrowed());
//
//        reader1.returnBook(book1, library);
//        System.out.println("books in library....\n\n");
//
//        System.out.println(library.getBookList());
        Library library = new Library(new Librarian("step librarian"));

        Book book1 = new Book("java");
        Book book2 = new Book("javaScript");
        Book book3 = new Book("C");
        Book book4 = new Book("C++");

        Reader reader1 = new Reader("reader1");
        Reader reader2 = new Reader("reader2");
        Reader reader3 = new Reader("reader3");

        library.addReader(reader1);
        library.addReader(reader2);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.lendBook(book1,reader1);

        System.out.println("library = " + library);

    }
}
