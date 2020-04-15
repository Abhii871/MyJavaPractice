package com.ControlFlow;

public class SumOddRange {
    public static boolean isodd(int number) {
        if (number > 0) {
            if (number % 2 == 0) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start <= end && ((start > 0) && (end > 0))) {
            for (int i = start; i <= end; i++) {
                if (isodd(i)) {
                    sum += i;

                } else {

                }
            }
            return sum;
        }
        return -1;
    }
}
