package com.step.assignments.polymorphism;

public class Console implements Display{

    private String content;

    public Console(String content) {
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println("Consoling on the Screen........\n" + content + "\n\n");

    }
}
