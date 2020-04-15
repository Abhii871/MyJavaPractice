package com.ControlFlow;

public class PalindromeNumber {

    public static void main(String[] args) {
        boolean flag = isPalindrome(-1291);
        System.out.println(flag);
    }

    public static boolean isPalindrome(int number) {
        int reverse=0, sum = 0, temp;
        temp = number;
        while (number != 0) {
            reverse = number % 10;  //getting remainder
            sum = (sum * 10) + reverse;
            number = number / 10;
        }
        if (temp == sum)  return true;

        else return false;
    }
}