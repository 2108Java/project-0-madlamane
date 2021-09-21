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
	
	String s;
	String s1;
	String s2;
	String s3;
	String s4;
	Registration r = new Registration();
	
	@Override
	public boolean insert() {
		boolean success = false;
		//1. Connect to database!
		Scanner sc =new Scanner(System.in);
		System.out.println("Can you fill up registration form : ");
		
		
		try(Connection connection = DriverManager.getConnection(url,username,password)){
			
			//2. Write a SQL statement String
			
			System.out.println("Enter your First name: " );
			s=  sc.nextLine();
			
			//System.out.println(s );
			
			System.out.println("Enter you Last name: " );
			 s1=  sc.nextLine();
			
			//System.out.println(s1 );
			
			System.out.println("Enter you account type:");
			 s2=  sc.nextLine();
			
			//System.out.println(s2 );
			
			System.out.println("Enter your user name: " );
			 s3=  sc.nextLine();
			
			//System.out.println(s3 );
			
			System.out.println("Enter your password: " );
			 s4=  sc.nextLine();
			
			
			
			System.out.println("Your registration is compleet . " );
			
				
				
			//Display a= new Display();
			
			//Registration r= new Registration();
			String sql = "INSERT INTO registration VALUES (?,?,?,?,?)";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setString(1, s);
			ps.setString(2, s1);
			ps.setString(3, s2);
			ps.setString(4, s3);
			ps.setString(5, s4);
			ps.execute();
			
			//r.setFirstname(ps.getString("firstname"));
			
			success = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("Your Registration is successfully complete ");
		return success;
	}

	

	

	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	public void select() {
		// TODO Auto-generated method stub
		//boolean success = false;
		
		System.out.println("this is registration table. " );
		//String [] a = {"first_name", "last_name", "account_type", "user_name","password"};
		
		//Registration r=new Registration();
		
		try(Connection connection = DriverManager.getConnection(url,username,password)){
			String sql = " SELECT * FROM registration";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			//int i=0;
			
			while(rs.next()) {
				String firstname=rs.getString("first_name");
				String lastname=rs.getString("last_name");
				String account=rs.getString("account_type");
				String username=rs.getString("user_name");
				String password=rs.getString("password");
				
				 System.out.println("First name is:- " + firstname + " Last Name is:- " + lastname + " account Type is:- " + account +
		                    " User_Name is:- " + username +"Password is"+ password );

				
				
				//i++;
			}
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		//return System.out.print;
	}

	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void transaction() {
		/*if(s1.equals(r.getLast_name())  ) {
			

			
			System.out.println("your registration is successfuly completed. ");
			
		}
		else {
			
			System.out.println("your registration cannot be completed . Other user with info exist already");
			
		}*/
		System.out.println(r.getLast_name());
		
	}

	
	
}
