package com.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.models.Registration;



public class DAOLoginImp implements DAOLogin {
	
	String server = "localhost";
	String url = "jdbc:postgresql://" + server + "/postgres";
	String username = "postgres";
	String password = "1983barada";

	@Override
	public boolean insert() {
		

		
			// TODO Auto-generated method stub
			
			boolean success = false;
			
			//DAOImp r= new DAOImp();
			
			//Registration r= new Registration();
			//1. Connect to database!
			Scanner sc =new Scanner(System.in);
			System.out.println("Can you login  : ");
			
			
			try(Connection connection = DriverManager.getConnection(url,username,password)){
				
				//2. Write a SQL statement String
				System.out.println("Enter your User Name  : ");
				String s=sc.nextLine();
				System.out.println("Enter your Password  : ");
				String s1=sc.nextLine();
				
				String sql = "INSERT INTO login_table VALUES (?,?)";
				
				PreparedStatement ps = connection.prepareStatement(sql);
				
				ps.setString(1, s);
				ps.setString(2, s1);
				
				ps.execute();
				
				success = true;
				
				/*if(r.getPassword().equals(s) && r.getPassword().equals(s1) ) {
					
					System.out.println("You Loggin Succesfully  : ");
				}
				else {
					System.out.println("You enter wrong user name or password  : ");
				}*/
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("You are loggin successfully ");
			return success;
	}
	

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String iselect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}

}
