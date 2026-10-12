package com.daisy.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class MathUtilDDTTest {

    //Chuan bi Data Test riêng 1 chỗ - Data Driven Testing - DDT
    public static Object[][] initTestData(){
        Object[][] testData = {
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120}
        };
        return testData;
    }
    // Test - nhồi data vào hàm assertEqual
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenValidNRunsWell(int n, long expected){
        assertEquals(expected, MathUtil.getFactorial(n));
    }

}