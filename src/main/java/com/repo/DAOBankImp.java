package com.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DAOBankImp implements DAOBank {
	
	static String server = "localhost";
	static String url = "jdbc:postgresql://" + server + "/postgres";
	static String username = "postgres";
	static String password = "1983barada";
	
	//private double account_number;
	//private String name1;
	//private String account_type1;
	private long balance;
	private long amount;
	
	Scanner sc =new Scanner(System.in);
	public  boolean openAccount() {
		boolean success = false;
		//1. Connect to database!
		
		System.out.println("Can you fill up this  form  to create new account: ");
		
		try(Connection connection = DriverManager.getConnection(url,username,password)){
			
			//2. Write a SQL statement String
			
			
			
			
			//System.out.println(s );
			System.out.println("Enter you name: "); 
			String name1= sc.nextLine();
			
			//System.out.println(s1 );

			
			
			
			System.out.println("Enter Account Type: ");  
			String account_type1=sc.nextLine();
			
			System.out.println("Enter Account Number: ");  
			double account_number=sc.nextDouble();
			
			//System.out.println(s2 );
			System.out.println("Enter your Balance: ");  
			balance=sc.nextLong();
			
			
			System.out.print("you are successfully open your new account ");  
			
String sql = "INSERT INTO bank_info2 VALUES (?,?,?,?)";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			
			
			ps.setString(1, name1);
			ps.setString(2, account_type1);
			ps.setDouble(3, account_number);
			ps.setLong(4, balance);
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
	public   void displayAccount()  {
		System.out.println("this is registration table. " );
		//String [] a = {"first_name", "last_name", "account_type", "user_name","password"};
		
		//Registration r=new Registration();
		
		try(Connection connection = DriverManager.getConnection(url,username,password)){
			String sql = " SELECT * FROM bank_info2";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			//int i=0;
			
			while(rs.next()) {
				
				String name1=rs.getString("name1");
				String account_type1=rs.getString("account_type1");
				double account_number=rs.getDouble("account_number");
				balance=rs.getLong("balance");
				
				
				 System.out.println( "Name is:- " + name1  );
				 System.out.println( "account Type is:- " + account_type1);
				 System.out.println( "My account number is:- " + account_number);
				 System.out.println( "My balance is:- " + balance);

				
				
				//i++;
			}
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	};
	public  void deposit() {
		
		System.out.println("Enter the amount you want to deposit: ");
		 amount= sc.nextInt();
		 
		 balance+= amount;
		 
		 
		 System.out.println("Your new balance is : " + balance);
		 
	};
	public  void withdrawl() {
		double amou;
		System.out.println("Enter the amount you want to withdraw: ");
		amou =sc.nextDouble();
		
		if(balance< amou) {
			System.out.println("Error Insuffisient Found: ");
		}
			
			
		else {
			
			balance-=amou;
			
			System.out.println("Balance after withdrawl is: " + balance);
			
		}
		
	}
	
	public void transfer () {
		int amount;
		System.out.println("Enter the amount you want to transfer: ");
		amount =sc.nextInt();
		
		
		
		if(balance< amount) {
			System.out.println("Error Insuffisient Found: ");
		}
			
			
		else {
			
			balance-=amount;
			
			System.out.println("The money is succcessfuly transfer: " + balance);
			
		}
	}
	

}
