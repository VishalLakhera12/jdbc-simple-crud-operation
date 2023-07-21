package com.jsp.jdbc_preparedstatement_crud.controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.Driver;

public class ProductDisplayController {

	public static void main(String[] args) {
Connection connection=null;
		
		try {
		
	Driver driver =new Driver();
	DriverManager.registerDriver(driver);
	
	String url="jdbc:mysql://localhost:3306/jdbc_preparedstatement";
	String user="root";
	String pass="VISHALLAKHERA2001";
	connection=DriverManager.getConnection(url, user, pass);
	
	String displayquery="select * from product";
	PreparedStatement preparedstatement=connection.prepareStatement(displayquery);
	ResultSet resultset=preparedstatement.executeQuery();

	while(resultset.next()) {
	int id=resultset.getInt("productid");
	String name=resultset.getString("productname");
	Double price=resultset.getDouble("productprice");
	String color=resultset.getString("productcolor");

	System.out.println("product id is "+id);
	System.out.println("product name is "+name);
	System.out.println("product price is "+price);
	System.out.println("product color is "+color);
	System.out.println("=======================================");
	
	}
		
		}
     catch (Exception e) {
		e.printStackTrace();
	}
		finally {
			try 
			{
				connection.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
	
		
	

