package com.jsp.jdbc_preparedstatement_crud.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.jdbc.Driver;

public class ProductUpdateController {

	public static void main(String[] args) {
      Connection connection=null;
		
		try {
		
	Driver driver =new Driver();
	DriverManager.registerDriver(driver);
	
	String url="jdbc:mysql://localhost:3306/jdbc_preparedstatement";
	String user="root";
	String pass="VISHALLAKHERA2001";
	connection=DriverManager.getConnection(url, user, pass);
	
	String updatequery="update product set productname=? where productid=?";
	PreparedStatement preparedstatement=connection.prepareStatement(updatequery);
	preparedstatement.setString(1, "ball pen");
	preparedstatement.setInt(2, 102);
	
	preparedstatement.executeUpdate();
	System.out.println("==========dataupdated==========");
	
		
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

