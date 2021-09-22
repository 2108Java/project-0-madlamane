package com.repo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.models.Registration;
import com.presentation.MainMenu;

public class DAOImp implements DAO {
	private static final Logger loggy = Logger.getLogger(DAOImp.class);
	
	String server = "localhost";
	String url = "jdbc:postgresql://" + server + "/postgres";
	String username = "postgres";
	String password = "1983barada";
	
	String s;
	String s1;
	String s2;
	String s3;
	String s4;
	String a;
	String b;
	Registration r = new Registration();
	public void joinAccount() {
		loggy.setLevel(Level.ALL);
		Scanner sc =new Scanner(System.in);
		System.out.println("Can you fill up  form : ");
		loggy.info("Can you fill up  form : ");
		
		
		try(Connection connection = DriverManager.getConnection(url,username,password)){
			
			//2. Write a SQL statement String
			
			System.out.println("Enter your First name: " );
			s=  sc.nextLine();
			loggy.info("Enter Your First name : ");
			loggy.info("First name is:"+s);
			
			//System.out.println(s );
			
			System.out.println("Enter you Last name: " );
			 s1=  sc.nextLine();
			 
			 loggy.info("Enter Your Last name : ");
			loggy.info("Last name is:"+s1);
			
			//System.out.println(s1 );
			 System.out.println("Enter your Email: " );
			 s2=  sc.nextLine();
			 
			 loggy.info("Enter Your Email : ");
			loggy.info("Last name is:"+s2);
			
			System.out.println("Enter you account type:");
			 s3=  sc.nextLine();
			 
			 loggy.info("Enter Your account type : ");
			loggy.info("Last name is:"+s3);
			
			//System.out.println(s2 );
			
			System.out.println("Enter your account number: " );
			 s4=  sc.nextLine();
			 
			 loggy.info("Enter Your account number : ");
			loggy.info("Last name is:"+s4);
			
			//System.out.println(s3 );
			
			
			//Registration r= new Registration();
				String sql = "select * from registration2 where account_type=? and account_number=? ";
				
				PreparedStatement ps = connection.prepareStatement(sql);
				
				ps.setString(1, s3);
				ps.setString(2, s4);
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					
					
				a= rs.getString("account_type");
				 b=rs.getString("account_number");
				}
				if(s3.equals(a) && s4.equals(b) ) {
					System.out.println("you are successfully create your join account");
					 loggy.info("you are successfully create your join account : ");
				}
				else {
					System.out.println("you failed to create your join account");
					 loggy.info("you failed to create your join account : ");
				}
				
				
		}
		
		
		//r.setFirstname(ps.getString("firstname"));
		
		
		
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	@Override
	public boolean insert() {
		loggy.setLevel(Level.ALL);
		boolean success = false;
		//1. Connect to database!
		Scanner sc =new Scanner(System.in);
		System.out.println("Can you fill up registration form : ");
		loggy.info("Can you fill up registration form : ");
		
		
		try(Connection connection = DriverManager.getConnection(url,username,password)){
			
			//2. Write a SQL statement String
			
			System.out.println("Enter your First name: " );
			s=  sc.nextLine();
			
			loggy.info("Enter Your First name : ");
			loggy.info("First name is:"+s);
			
			
			//System.out.println(s );
			
			System.out.println("Enter you Last name: " );
			 s1=  sc.nextLine();
			
			 loggy.info("Enter Your Last name : ");
				loggy.info("Last name is:"+s1);
			//System.out.println(s1 );
			 System.out.println("Enter your Email: " );
			 s2=  sc.nextLine();
			 
			 loggy.info("Enter Your Email : ");
				loggy.info("Email is:"+s2);
			
			System.out.println("Enter you account type:");
			 s3=  sc.nextLine();
			 
			 loggy.info("Enter Your account_type : ");
				loggy.info("account Type is:"+s3);
			
			//System.out.println(s2 );
			
			System.out.println("Enter your phone number number: " );
			 s4=  sc.nextLine();
			
			 
			 loggy.info("Enter Your phone number : ");
				loggy.info("phone number is is:"+s4);
			//System.out.println(s2 );
			
			
			
			//System.out.println(s3 );
			
			
			
			
			
			System.out.println("Your registration is compleet . " );
			loggy.info("Your registration is compleet . ");
				
				
			//Display a= new Display();
			
			//Registration r= new Registration();
			String sql = "INSERT INTO registration3 VALUES (?,?,?,?,?)";
			
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
			String sql = " SELECT * FROM registration1";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			//int i=0;
			
			while(rs.next()) {
				String firstname=rs.getString("first_name");
				String lastname=rs.getString("last_name");
				String email=rs.getString("email");
				String account_type=rs.getString("account_type");
				String phone_number=rs.getString("phone_number");
				
				 System.out.println("First name is:- " + firstname + " Last Name is:- " + lastname + " Email Address is:- " + email +
		                    " Accounttype is:- " + account_type+"phone _number"+ phone_number );

				
				
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
