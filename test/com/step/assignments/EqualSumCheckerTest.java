package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualSumCheckerTest {

    @Test
    void main() {
    }

    @Test
    void shouldReturnFalseHasEqualSum() {
        boolean expected = false;
        boolean actual = EqualSumChecker.hasEqualSum(1,1,1);
        assertEquals(expected,actual);
    }

    @Test
    void shouldReturnTrueHasEqualSum() {
        boolean expected = true;
        boolean actual = EqualSumChecker.hasEqualSum(1,1,2);
        assertEquals(expected,actual);
    }
}