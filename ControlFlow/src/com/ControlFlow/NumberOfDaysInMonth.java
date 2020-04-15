package com.ControlFlow;

import java.lang.invoke.SwitchPoint;

public class NumberOfDaysInMonth {

        public static boolean isLeapYear(int year) {

            if (year >= 1 && year < 9999) {
                if ((year / 4 == 0) && (year / 100 != 0) || (year / 400 == 0)) {

                    return true;
                }
            } else{
                //System.out.println("Not leap");
            }
                return false;

        }

    public static int getDaysInMonth(int month, int year) {

        if ((month < 1 && month > 12) && ((year < 1) && year > 9999)) {
            return -1;

        } else {
            boolean leap = isLeapYear(year);
            if (leap == true) {
                switch (month) {
                    case 1:
                        System.out.println("January= 31");
                        break;
                    case 2:
                        System.out.println("February= 29");
                        break;
                    case 3:
                        System.out.println("March= 31");
                        break;
                    case 4:
                        System.out.println("April= 30");
                        break;
                    case 5:
                        System.out.println("May= 31");
                        break;
                    case 6:
                        System.out.println("June= 30");
                        break;
                    case 7:
                        System.out.println("July= 31");
                        break;
                    case 8:
                        System.out.println("August= 31");
                        break;
                    case 9:
                        System.out.println("September= 30");
                        break;
                    case 10:
                        System.out.println("october= 31");
                        break;
                    case 11:
                        System.out.println("nov= 30");
                        break;
                    case 12:
                        System.out.println("december= 31");
                        break;

                }
            } else {
                switch (month) {
                    case 1:
                        System.out.println("January= 31");
                        break;
                    case 2:
                        System.out.println("February= 28");
                        break;
                    case 3:
                        System.out.println("March= 31");
                        break;
                    case 4:
                        System.out.println("April= 30");
                        break;
                    case 5:
                        System.out.println("May= 31");
                        break;
                    case 6:
                        System.out.println("June= 30");
                        break;
                    case 7:
                        System.out.println("July= 31");
                        break;
                    case 8:
                        System.out.println("August= 31");
                        break;
                    case 9:
                        System.out.println("September= 30");
                        break;
                    case 10:
                        System.out.println("october= 31");
                        break;
                    case 11:
                        System.out.println("nov= 30");
                        break;
                    case 12:
                        System.out.println("december= 31");
                        break;

                }

            }

        }
        return -1;
    }

}
