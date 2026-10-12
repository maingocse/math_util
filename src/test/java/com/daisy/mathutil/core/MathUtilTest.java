package com.daisy.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathUtilTest {

    @Test
    void testFactorialGivenValidN5ReturnsWell120() {
        long expected = 120;
        int n = 5;
        long actual = MathUtil.getFactorial(n);

        assertEquals(expected, actual);
    }

    @Test
    void testFactorialGivenValidN6ReturnsWell720() {
        long expected = 720;
        int n = 6;
        long actual = MathUtil.getFactorial(n);

        assertEquals(expected, actual);
    }

    @Test
    void testFactorialGivenValidN0ReturnsWell1() {
        long expected = 1;
        int n = 0;
        long actual = MathUtil.getFactorial(n);

        assertEquals(expected, actual);
    }

    @Test
    void testFactorialGivenInvalidNNegative1ThrowsException() {
        int n = -1;

        assertThrows(IllegalArgumentException.class,
                () -> MathUtil.getFactorial(n));
    }
}