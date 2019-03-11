package com.step.assignments.polymorphism;

public class PDFPage implements Print{

    private String content;

    public PDFPage(String content) {
        this.content = content;
    }

    @Override
    public void print() {

        System.out.println("Prining pdf......\n" + content + "\n\n");
    }
}
