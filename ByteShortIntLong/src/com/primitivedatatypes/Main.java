package com.primitivedatatypes;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	double double1 = 20.00;
	double double2= 80.00;
	Double multi1=(double1+double2)*100;
      	double remainder = multi1%41.00;
	boolean check= remainder ==0 ? true:false;
        System.out.println(check);
	if (check==false){
        System.out.println("Got some remainder");

    }


    }

}
