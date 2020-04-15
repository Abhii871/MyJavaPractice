package com.ControlFlow;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        int i = 0, sum = 0, count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        while (count<10) {
            int order = count + 1;
            System.out.println("Enter Number #" + order + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;
            }
            else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("The sum is ="+sum);
    }

}



