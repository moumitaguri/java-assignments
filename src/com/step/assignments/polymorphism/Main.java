package com.step.assignments.polymorphism;

public class Main {

    public static void main(String[] args) {

        String content = "This is the content";
        String pdfContent = "This is the pdf content";
        String webpageContent = "This is the webpage content";
        String nonInterActiveWebPageContent = "This is the non interactive webpage content";

        Console console = new Console(content);
        PDFPage pdfPage = new PDFPage(pdfContent);
        WebPage webPage = new WebPage(webpageContent);
        NonInteractiveWebPage nonInteractiveWebPage = new NonInteractiveWebPage(nonInterActiveWebPageContent);



        console.display();

        pdfPage.print();

        webPage.display();
        webPage.print();
        webPage.click();

        nonInteractiveWebPage.display();
        nonInteractiveWebPage.print();
        nonInteractiveWebPage.click();

    }
}
