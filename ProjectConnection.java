package test;

import java.sql.*;
import java.sql.Connection;
import java.lang.*;



public class ProjectConnection {


	
	private  static String URL="jdbc:mysql://127.0.0.1:3306/testdatabase?user=root&password=";
	private static ProjectConnection instance;
	private static Connection conn;
	{
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		}catch(Exception e){
			System.out.println("exception e");
		}
	}
	
	
	
	
	private ProjectConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			 conn= DriverManager.getConnection(URL);
	
			 
			
		}catch(Exception e){
			System.out.println("exception:"+e);
			 e.printStackTrace();
			
		}
	}
	
	
	public static Connection getConnection(){
		if(instance==null){
			instance=new ProjectConnection();
		}
		return conn;
		
		
	}
	jhkgjh
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	




}
