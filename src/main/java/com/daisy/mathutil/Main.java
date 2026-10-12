package com.daisy.mathutil;

import com.daisy.mathutil.core.MathUtil;

public class Main {

    public static void main(String[] args) {

        //TODO - Viết code bắt đầu từ viết test
        testFactorialGivenValidN5ReturnWell120();
    }

    //test hàm tính giai thừa n = 5 và hy vọng trả về 120
    public static void testFactorialGivenValidN5ReturnWell120() {

        long expected = 120;
        int n = 5;
        long actual = MathUtil.getFactorial(n);

        System.out.println("Check 5! | expected: "
                + expected + " | actual: " + actual);
    }

}