package com.nttdata.Xmlbasics;


	class Connectionhandler 
	{
		
	String url;
	int port;
	Connectionhandler con=null;
	private Connectionhandler(){}
	public Connectionhandler getConnection()
	{
		
	}
	
		 public static void main(String arg[])
		 { 
		 Runnable print=new Runnable(){
		 public void run(){
		 System.out.println("Thread started...");
		 }

		 };
		 Thread myThread=new Thread(print);
		 myThread.start();
		 } 