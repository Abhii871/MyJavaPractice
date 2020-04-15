package com.ControlFlow;

import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Max_Min();
    }

    public static void Max_Min() {
        int number, count = 0, min = 0, max = 0;
        boolean first =true;
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Entered number");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                number = scanner.nextInt();
                if (first){
                    first =false;
                    min=number;
                    max=number;
                }

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
                if (count == 10) {
                    break;
                }
            } else {
                break;
            }

            scanner.nextLine();
        }
        System.out.println("Max number is:" + max);
        System.out.println("Min number is:" + min);

    }
}
