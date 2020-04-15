package com.ControlFlow;

public class WhileStatement<num2, num1> {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 60;
        int count = 0;

        while (num1 <= num2) {
            num1++;
            if (!(isEvenNumber(num1))) {
                continue;
            }
            count++;

            System.out.println("Even number = " + num1);

        }
        if (count <= 5) {
            System.out.println("Number of even nymbers is = " + count);
        }

    }

    public static boolean isEvenNumber(int number) {

        if (number > 0) {
            if (number % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

}
