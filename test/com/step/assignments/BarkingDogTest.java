package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarkingDogTest {

    @Test
    void main() {
    }

    @Test
    void shouldWakeUpIfBarkingBefore8() {
        boolean expected = true;
        boolean actual = BarkingDog.shouldWakeUp(true,1);
        assertEquals(expected,actual);
    }

    @Test
    void shouldNotWakeUpIfBarkingButHourOfDayNotInRange() {
        boolean expected = false;
        boolean actual = BarkingDog.shouldWakeUp(true,-1);
        assertEquals(expected,actual);
    }

    @Test
    void shouldNotWakeUpIfNotBarking() {
        boolean expected = false;
        boolean actual = BarkingDog.shouldWakeUp(false,2);
        assertEquals(expected,actual);
    }

    @Test
    void shouldNotWakeUpBefore8() {
        boolean expected = false;
        boolean actual = BarkingDog.shouldWakeUp(true,8);
        assertEquals(expected,actual);
    }

    @Test
    void shouldWakeUpAfter22() {
        boolean expected = true;
        boolean actual = BarkingDog.shouldWakeUp(true,23);
        assertEquals(expected,actual);
    }
}