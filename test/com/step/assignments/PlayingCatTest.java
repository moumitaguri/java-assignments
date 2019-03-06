package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayingCatTest {

    @Test
    void catNotPlayingSummerTemperatureNotInRange() {
        boolean actual = PlayingCat.isCatPlaying(true, 10);
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    void catNotPlayingTemperatureNotInRange() {
        boolean actual = PlayingCat.isCatPlaying(false, 36);
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    void catPlayingTemperatureInRange() {
        boolean actual = PlayingCat.isCatPlaying(false, 35);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    void catPlayingTemperatureInSummerRange() {
        boolean actual = PlayingCat.isCatPlaying(true, 45);
        boolean expected = true;
        assertEquals(expected,actual);

    }
}