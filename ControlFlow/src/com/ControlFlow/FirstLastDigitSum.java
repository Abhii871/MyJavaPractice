package com.ControlFlow;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        int result = sumFirstAndLastDigit(2399999);
        System.out.println(result);
    }

    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        int lastDigit ;
        int firstDigit = 0;
        while (number >= 10) {
            firstDigit = number / 10;
            number /= 10;


        }
        System.out.println(firstDigit +"First Digit");
        lastDigit = number % 10;
        sum = lastDigit + firstDigit;
        return sum;


    }

}

