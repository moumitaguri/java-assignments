package com.step.assignments.exercise.library;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Library library = new Library(new Librarian("step librarian"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Library!!");

        while(true) {
            printInstructions();

            System.out.println("Enter Choice.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Reader Name to insert");
                    String readerName = scanner.nextLine();

                    library.addReader(new Reader(readerName));
                    System.out.println("new reader added");
//                    boolean wasSuccessfull = library.addReader(new Reader(readerName));
//                    System.out.println(wasSuccessfull ? "Added Successfully" : "Already Exist");
                    break;

                case 2:
                    System.out.println("Book Name to insert");
                    String bookname = scanner.nextLine();

                    library.addBook(new Book(bookname));
                    System.out.println("new book added");
//                    wasSuccessfull = library.addBook(new Book(bookname));
//                    System.out.println(wasSuccessfull ? "Added Successfully" : "Already Exist");
                    break;

                case 3:
                    System.out.println("Showing Library details");
                    System.out.println(library);
                    break;

                default:
                    System.out.println("Quitting Library");
                    System.exit(0);

            }
        }
    }

    private static void printInstructions(){

        System.out.println("Enter 1 to add new reader");
        System.out.println("Enter 2 to add new book");
        System.out.println("Enter 3 to show library details");
//        System.out.println("Enter 4 to borrow a book");
//        System.out.println("Enter 5 to return a book");
        System.out.println("Enter 0 to quit");
    }
}

