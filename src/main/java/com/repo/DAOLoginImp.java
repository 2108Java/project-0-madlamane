package com.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.models.Customer;
import com.models.Registration;
import com.models.User;



public class DAOLoginImp implements DAOLogin {
	private static final Logger loggy = Logger.getLogger(DAOLoginImp.class);
	
	String server = "localhost";
	String url = "jdbc:postgresql://" + server + "/postgres";
	String username = "postgres";
	String password = "1983barada";
	
	Scanner sc =new Scanner(System.in);
	
	//String s;
	//String s1;
	

	@Override
	public boolean insert() {
		loggy.setLevel(Level.ALL);
		

		
			// TODO Auto-generated method stub
			
			boolean success = false;
			
			//DAOImp r= new DAOImp();
			
			//Registration r= new Registration();
			//1. Connect to database!
			
			System.out.println("Can you login Form please : ");
			 loggy.info("Can you login Form please : ");
			
			
			
			try(Connection connection = DriverManager.getConnection(url,username,password)){
				
				//2. Write a SQL statement String
				System.out.println("Enter your User Name  : ");
				 loggy.info("Enter your User Name  : ");
				String s=sc.nextLine();
				System.out.println("Enter your Password  : ");
				loggy.info("Enter your Password  : ");
				String s1=sc.nextLine();
				
				String sql = "INSERT INTO login_table1 VALUES (?,?)";
				
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
			System.out.println("You succesfully create your logging ");
			loggy.info("You succesfully create your logging ");
			return success;
	}
	

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void iselect() {
		loggy.setLevel(Level.ALL);
		// TODO Auto-generated method stub
		String username1="";
		String password1="";
		
		System.out.println("Enter your User Name  : ");
		String s2=sc.nextLine();
		System.out.println("Enter your Password  : ");
		String s3=sc.nextLine();
		//User u= new User();
		
		try(Connection connection = DriverManager.getConnection(url,username,password)){
			String sql = " SELECT * FROM login_table1 where user_name=? and password=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, s2);
			ps.setString(2, s3);
			ResultSet rs = ps.executeQuery();
			int i=0;
			
			while(rs.next()) {
				
				username1=rs.getString("user_name");
				password1=rs.getString("password");
				
				
				
				
				//System.out.println( "Name is:- " + username1  );
				// System.out.println( "Password is:- " + password1  );
				 
				
				
				//i++;
				
				
				
				
				 
				 }
			if(s2.equals(username1) && s3.equals(password1)) {
				
				 System.out.println("Successful Login!\n----");
				//break;
		    } 
			/*else if(s2.equals(username1)){
		    	 System.out.println("Invalid Password!");
		    	 //break;
		    }
		    else if(s3.equals(password1)){
		    	System.out.println("Invalid Username!");
		    	//break;
		    }*/
		    else
		    {
		        System.out.println("Invalid Username or Password");
		     // break;
		    }
			
			
			
			
			
				
			}
			
			
			
			
			
			
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return null;
	}

	@Override
	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}
	public void viewLog() {
		String username1="";
		String password1="";
		
		try(Connection connection = DriverManager.getConnection(url,username,password)){
			String sql = " SELECT * FROM login_table1 ";
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			int i=0;
			
			while(rs.next()) {
				
				username1=rs.getString("user_name");
				password1=rs.getString("password");
				
				
				
				
				System.out.println( "Name is:- " + username1  );
				System.out.println( "Password is:- " + password1  );
				 
				
				
				//i++;
				
				
				
				
				 
				 }
			
			
			
			
			
			
				
			}
			
			
			
			
			
			
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
