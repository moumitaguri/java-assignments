package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondsAndMinutesTest {

    @Test
    void getDurationStringSecondLessThanZero() {
        String expected = "Invalid value";
        String actual = SecondsAndMinutes.getDurationString(-4);
        assertEquals(expected,actual);

    }

    @Test
    void getDurationStringMinutesLessThanZero() {
        String expected = "Invalid value";
        String actual = SecondsAndMinutes.getDurationString(-4,2);
        assertEquals(expected,actual);
    }
    @Test
    void getDurationStringSecondsGreaterThan59() {
        String expected = "Invalid value";
        String actual = SecondsAndMinutes.getDurationString(-4, 60);
        assertEquals(expected,actual);

    }
    @Test
    void getDurationStringValidSeconds() {
        String expected = "2h 0m 30s";
        String actual = SecondsAndMinutes.getDurationString(7230);
        assertEquals(expected,actual);
    }

    @Test
    void getDurationStringValidMinutesAndSeconds() {
        String expected = "0h 2m 5s";
        String actual = SecondsAndMinutes.getDurationString(2,5);
        assertEquals(expected,actual);
    }
}