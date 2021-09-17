package com.repo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.models.Registration;

public class DAOImp implements DAO {
	
	String server = "localhost";
	String url = "jdbc:postgresql://" + server + "/postgres";
	String username = "postgres";
	String password = "1983barada";
	
	@Override
	public boolean insert(Registration registration) {
		boolean success = false;
		//1. Connect to database!
		Scanner sc =new Scanner(System.in);
		System.out.println("Can you fill up registration form : ");
		
		
		try(Connection connection = DriverManager.getConnection(url,username,password)){
			
			//2. Write a SQL statement String
			System.out.println("Enter your First Name  : ");
			String s=sc.nextLine();
			System.out.println("Enter your Last Name  : ");
			String s1=sc.nextLine();
			System.out.println("Enter your Account type  : ");
			String s2=sc.nextLine();
			System.out.println("Enter your user name  : ");
			String s3=sc.nextLine();
			
			System.out.println("Enter yourpassword  : ");
			String s4=sc.nextLine();
			//Display a= new Display();
			String sql = "INSERT INTO registration VALUES (?,?,?,?,?)";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setString(1, s);
			ps.setString(2, s1);
			ps.setString(3, s2);
			ps.setString(4, s3);
			ps.setString(5, s4);
			ps.execute();
			
			success = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Your Registration is successfully complete ");
		return success;
	}

	

	

	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	public String iselect() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
