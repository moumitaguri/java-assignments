package com.step.assignments.generics.exercise;

import java.util.ArrayList;

public abstract class Range<T> {

    protected T start;
    protected T end;

    public Range(T start, T end) {
        this.start = start;
        this.end = end;
    }

    abstract ArrayList<T> getAll();
    abstract boolean containsElement(T element);

}
