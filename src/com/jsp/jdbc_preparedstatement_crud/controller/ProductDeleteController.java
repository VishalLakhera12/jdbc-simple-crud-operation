package com.jsp.jdbc_preparedstatement_crud.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.jdbc.Driver;

public class ProductDeleteController {

	public static void main(String[] args) {
Connection connection=null;
		
		try {
		
	Driver driver =new Driver();
	DriverManager.registerDriver(driver);
	
	String url="jdbc:mysql://localhost:3306/jdbc_preparedstatement";
	String user="root";
	String pass="VISHALLAKHERA2001";
	connection=DriverManager.getConnection(url, user, pass);
	
	String deletequery="delete from product where productid=?";
	PreparedStatement preparedstatement=connection.prepareStatement(deletequery);
	preparedstatement.setInt(1,101);
	
	preparedstatement.executeUpdate();
	System.out.println("==========datadeleted=========");
	
		
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


