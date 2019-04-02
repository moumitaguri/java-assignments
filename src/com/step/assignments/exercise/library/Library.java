package com.step.assignments.exercise.library;

import java.util.HashMap;
import java.util.HashSet;

public class Library {

    protected HashMap<String, Book> bookList;
    protected HashMap<String, Reader> readers;
    private HashMap<String, String> borrowedBooks;

    private Librarian librarian;

    public Library(Librarian librarian) {
        this.bookList = new HashMap<>();
        this.readers = new HashMap<>();
        this.librarian = librarian;
        this.borrowedBooks = new HashMap<>();

    }

    public void addReader(Reader reader) {
        readers.putIfAbsent(reader.getName(), reader);
    }

    public void addBook(Book book) {
        bookList.putIfAbsent(book.getTitle(), book);
    }

//    public boolean search(Book book) {
//        return bookList.values().contains(book);
//    }

//    public void remove(Book book) {
//        bookList.remove(book.bookId);
//    }


    @Override
    public String toString() {
        return "Library{" +
                "bookList=" + bookList +
                ", readers=" + readers +
                ", borrowedBooks=" + borrowedBooks +
                ", librarian=" + librarian +
                '}';
    }


//    public HashMap<String, Reader> getReaders() {
//        return readers;
//    }


//    public HashSet<String> getReaderIds() {
//        return readerIds;
//    }

    private boolean isValidReader(Reader reader){
        return readers.keySet().contains(reader.getName());
    }

    private boolean isAvailableBook(Book book){
       return bookList.keySet().contains(book.getTitle());
    }

    public boolean lendBook(Book book, Reader reader) {

        if (!isValidReader(reader) || !isAvailableBook(book)){
            return false;
        }
        reader.borrow(book);
        this.bookList.remove(book.getTitle());
        this.borrowedBooks.put(book.getTitle(),reader.getName());
        return true;
//        reader.bookList.add(book);
//        this.bookList.remove(book.getBookId());
//        this.borrowedBooks.put(book, reader);
//        System.out.println("borrowed book....\n" + book.toString() + "\n\n");

    }

//    public Book provideSearch(Reader reader, Book book){
//        if (!isAvailableBook(book)){
//            return null;
//        }
//        return book;
//    }

    public void restoreBook(Book book, Reader reader) {

        reader.returnBook(book);
        this.bookList.put(book.getTitle(),book);
        this.borrowedBooks.remove(book.getTitle());
//        reader.bookList.remove(book);
//        this.bookList.put(book.getBookId(), book);
//        this.borrowedBooks.remove(book);
//        System.out.println("returned book ...\n" + book.toString() + "\n\n");
    }


}
