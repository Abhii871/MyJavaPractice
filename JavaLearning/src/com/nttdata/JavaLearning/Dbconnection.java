package com.nttdata.JavaLearning;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
//import org.apache.log4j.Logger;
public class Dbconnection {
	//private static Logger log=Logger.getLogger(ReportEFXPRDConnectionUtility.class.getName());
	public  Connection getDBConnection()
	{
		 Connection connection=null;		
		 
		try{
		 
		  Class.forName("oracle.jdbc.driver.OracleDriver");
	 
		  File file = new File("DBdetails"); 				  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 				  
		  String conn,username,pass; 
		  conn=br.readLine();				
		  username = br.readLine();				
		  pass=br.readLine();	
		  Connection con= DriverManager.getConnection(conn,username,pass);
	      System.out.println("Connecton successfull");
	      Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from emp3");  
			
			while(rs.next())  
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+ rs.getInt(3));  
			
			con.close(); 
	     }
		catch(Exception e)	
		{
			e.printStackTrace();
			//log.error(e.getMessage(), e);
		}
		return connection;
	}
	
   public static void main(String[] args) {
   Dbconnection ma = new Dbconnection();
   ma.getDBConnection();
	
}
}
