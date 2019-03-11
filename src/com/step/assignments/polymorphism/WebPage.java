package com.step.assignments.polymorphism;

public class WebPage extends Console implements Print,Click {

    private String content;

    public WebPage(String content) {
        super(content);
        this.content = content;
    }


    @Override
    public void print() {
        System.out.println("Printing webPage Content.......\n" + content + "\n");
    }

    @Override
    public void click() {
        System.out.println("Clicked on the web page ......\n\n");
    }
}
