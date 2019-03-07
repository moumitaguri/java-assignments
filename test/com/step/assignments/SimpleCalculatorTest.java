package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {


    @Test
    void getAdditionResult() {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        double actual = calculator.getAdditionResult();
        double expected = 9.0;
        assertEquals(expected,actual);

    }

    @Test
    void getSubtractionResult() {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        double actual = calculator.getSubtractionResult();
        double expected = 1.0;
        assertEquals(expected,actual);
    }

    @Test
    void getMultiplicationResult() {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        double actual = calculator.getMultiplicationResult();
        double expected = 0.0;
        assertEquals(expected,actual);
    }

    @Test
    void getDivisionResult() {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        double actual = calculator.getDivisionResult();
        System.out.println(actual);
        double expected = 0.0;
        assertEquals(expected,actual);
    }

}