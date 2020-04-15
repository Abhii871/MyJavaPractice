package com.nttdata.JavaLearning;

public class VariablesTest {

	 //Instance variables
	int var=10;
		// salary  variable is a private static variable
	   private static double salary;

	   // DEPARTMENT is a constant
	   public static final String DEPARTMENT = "Development ";
	   
	void method1(){
	//local variable
		int var=11;
		System.out.println("Local variable is "+var);
		
		
	
	}
public static void main(String [] args)	{
	salary= 7000;
	System.out.println(DEPARTMENT +"salary is: "+salary);
	VariablesTest obj = new VariablesTest();
	obj.method1();
	
		
	}
}
