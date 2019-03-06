package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeenNumberCheckerTest {

    @Test
    void main() {
    }

    @Test
    void hasTeenShouldReturnTrue() {
        boolean actual = TeenNumberChecker.hasTeen(9,99,19);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    void hasTeenShouldReturnFalse() {
        boolean actual = TeenNumberChecker.hasTeen(22,23,34);
        boolean expected = false;
        assertEquals(expected,actual);
    }
}