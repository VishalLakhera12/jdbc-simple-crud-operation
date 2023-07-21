package com.jsp.jdbc_preparedstatement_crud.controller;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.mysql.jdbc.Driver;

public class ProductInsertController {

	public static void main(String[] args) {
		Connection connection=null;
		
		try {
		
	Driver driver =new Driver();
	DriverManager.registerDriver(driver);
	
	String url="jdbc:mysql://localhost:3306/jdbc_preparedstatement";
	String user="root";
	String pass="VISHALLAKHERA2001";
	connection=DriverManager.getConnection(url, user, pass);
	
	String insertquery="insert into product values(?,?,?,?)";
	PreparedStatement preparedstatement=connection.prepareStatement(insertquery);
	preparedstatement.setInt(1, 103);
	preparedstatement.setString(2, "sketch");
	preparedstatement.setDouble(3, 50);
	preparedstatement.setString(4, "black");
	preparedstatement.execute();
	System.out.println("==========datainserted==========");
	
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
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
