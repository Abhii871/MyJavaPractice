package com.ControlFlow;


public class FlourPacker {

    public static void main(String[] args) {
        boolean flag =canPack(1, 0, 6);
        System.out.println(flag);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int totalBig = bigCount * 5;
        int totalSmall = smallCount * 1;
        int sum = totalBig + totalSmall;

        if (totalBig < 0 && totalSmall < 0 && goal < 0) {
            return false;
        }

        if (sum <= goal) {


        if ((goal>bigCount && smallCount ==0)){
            System.out.println("HI");
            return true;

        }
        }


        return false;

    }
}
