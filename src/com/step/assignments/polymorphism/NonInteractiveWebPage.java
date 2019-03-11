package com.step.assignments.polymorphism;

public class NonInteractiveWebPage extends WebPage {
    private String content;
    public NonInteractiveWebPage(String content) {
        super(content);
        this.content = content;
    }

    @Override
    public void click() {
        System.out.println("Oops! This page is not interactive...You can't click\n\n");
    }
}
