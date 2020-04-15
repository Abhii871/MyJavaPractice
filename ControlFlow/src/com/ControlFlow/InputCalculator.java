package com.ControlFlow;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int number = 0, sum = 0;
        long average = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                count++;
                number = scanner.nextInt();
                sum += number;
                double out = (double) sum / count;
                average = Math.round(out);
            } else {
                break;
            }
        }
        scanner.nextLine();

        System.out.println("SUM = " + sum + " " + "AVG = " + average);
    }
}
