package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaCalculatorTest {

    @Test
    void main() {
    }

    @Test
    void areaOfCircleWhenInvalidRadius(){
        double actualArea = AreaCalculator.area(-1);
        double expectedArea = -1.0;
        assertEquals(expectedArea, actualArea);

    }

    @Test
    void areaOfCircleWhenValidRadius() {
        double actualArea = AreaCalculator.area(5.0);
        double expectedArea = 78.53981633974483;
        assertEquals(expectedArea, actualArea);
    }

    @Test
    void areaOfRectangleWhenInvalidLengthAndBreadth() {
        double actualArea = AreaCalculator.area(-1.0, 4.0);
        double expectedArea = -1.0;
        assertEquals(expectedArea, actualArea);
    }

    @Test
    void areaOfRectangleWhenValidLengthAndBreadth() {
        double actualArea = AreaCalculator.area(5.0, 4.0);
        double expectedArea = 20.0;
        assertEquals(expectedArea, actualArea);
    }
}