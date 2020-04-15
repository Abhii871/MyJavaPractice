package com.ControlFlow;

public class DigitSum {
    public static void main(String[] args) {
        int flag = sumDigits(12);
        System.out.println(flag);
    }

    public static int sumDigits(int number) {
        int sum = 0;

        if (number >= 10) {
            while (number != 0) {
                sum = sum + number % 10;
                number = number / 10;

            }

        }else {
            return -1;
        }
        return sum;
    }
}
