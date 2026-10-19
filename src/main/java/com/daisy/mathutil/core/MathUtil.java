package com.daisy.mathutil.core;

public class MathUtil {

    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("n must be between 0 and 20");
//        }
//
//        long result = 1;
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;

        // TỐi Ưu tinh chỉnh code để nó hay hơn, ổn hơn (thuật toán ) Refactoring


        //ĐỔI HÀM TÍNH ĐỆ QUY RECURSION
        if ( n < 0 || n > 20){
            throw new IllegalArgumentException("n must be between 0 and 20");
        }
        if ( n == 0 || n == 1){
            return 1; // điểm dừng đệ quy không lùi nữa lùi đến 1 là tính được
        }
        // Tính được n! = n * (n-1)!
        return n * getFactorial(n - 1);
    }
}