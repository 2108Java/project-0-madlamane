package com.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class DAOBankImp implements DAOBank {
	private static final Logger loggy = Logger.getLogger(DAOBankImp.class);
	static String server = "localhost";
	static String url = "jdbc:postgresql://" + server + "/postgres";
	static String username = "postgres";
	static String password = "1983barada";
	
	//private double account_number;
	//private String name1;
	//private String account_type1;
	private long balance;
	private long amount;
	String full_name;
	String e_mail;
	String full_name1;
	String e_mail1;
	String a;
	double b;
	
	Scanner sc =new Scanner(System.in);
	
	public void joinAccount() {
		loggy.setLevel(Level.ALL);
		//Scanner sc =new Scanner(System.in);
		System.out.println("Can you fill up  form to create join account : ");
		loggy.info("Can you fill up  form  to create join account: ");	
		try(Connection connection = DriverManager.getConnection(url,username,password)){
			
			
			System.out.println("Enter you full name: "); 
			full_name= sc.nextLine();
			
			 loggy.info("Enter Your full name : ");
				loggy.info("full name is:"+full_name);
			
			
			//System.out.println(s1 );

			System.out.println("Enter your E-mail address: "); 
			String e_mail= sc.nextLine();
			
			 
			 loggy.info("Enter Your Email : ");
				loggy.info("Email is:"+e_mail);
			
			
			System.out.println("Enter Account Type: ");  
			String account_type1=sc.nextLine();
			
			 
			 loggy.info("Enter Your account_type : ");
				loggy.info("account Type is:"+account_type1);
			
			System.out.println("Enter Account Number: ");  
			double account_number=sc.nextDouble();
			
			 
			 loggy.info("Enter Your Account_number : ");
				loggy.info("Email is:"+account_number);
			
			//System.out.println(s2 );
			System.out.println("Enter your Balance: ");  
			balance=sc.nextLong();
			
			 
			 loggy.info("Enter Your Balance : ");
				loggy.info("Email is:"+balance);
			
			String sql = "select * from bank_info3 where account_type1=? and account_number=? ";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setString(1, account_type1);
			ps.setDouble(2, account_number);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				
			a= rs.getString("account_type1");
			 b=rs.getDouble("account_number");
			}
			if(account_type1.equals(a) && account_number == b ) {
				System.out.println("you are successfully create your join account");
				 loggy.info("you are successfully create your join account : ");
			}
			else {
				System.out.println("you failed to create your join account");
				 loggy.info("you failed to create your join account : ");
			}
			
	
		}
	 catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public  boolean openAccount() {
		loggy.setLevel(Level.ALL);
		boolean success = false;
		//1. Connect to database!
		
		System.out.println("Can you fill up this  form  to create new account: ");
		 loggy.info("Can you fill up this  form  to create new account: ");
		
		
		try(Connection connection = DriverManager.getConnection(url,username,password)){
			
			//2. Write a SQL statement String
			
			
			
			
			//System.out.println(s );
			System.out.println("Enter you full name: "); 
			full_name= sc.nextLine();
			
			 loggy.info("Enter Your full name : ");
				loggy.info("full name is:"+full_name);
			
			
			//System.out.println(s1 );

			System.out.println("Enter your E-mail address: "); 
			String e_mail= sc.nextLine();
			
			loggy.info("Enter Your Email : ");
			loggy.info("Email is:"+e_mail);
		
			
			
			System.out.println("Enter Account Type: ");  
			String account_type1=sc.nextLine();
			
			 loggy.info("Enter Your account_type : ");
				loggy.info("account Type is:"+account_type1);
			
			System.out.println("Enter Account Number: ");  
			double account_number=sc.nextDouble();
			
			 loggy.info("Enter Your Account_number : ");
				loggy.info("Email is:"+account_number);
			
			//System.out.println(s2 );
			System.out.println("Enter your Balance: ");  
			balance=sc.nextLong();
			
			 loggy.info("Enter Your Balance : ");
				loggy.info("Email is:"+balance);
			
			
			System.out.print("you are successfully open your new account ");  
			 loggy.info("you are successfully open your new account ");

			 
			 String sql = "INSERT INTO bank_info3 VALUES (?,?,?,?,?)";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			
			
			ps.setString(1, full_name);
			ps.setString(2, e_mail);
			ps.setString(3, account_type1);
			ps.setDouble(4, account_number);
			ps.setLong(5, balance);
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
	
	public void decision() {
		loggy.setLevel(Level.ALL);
		System.out.println("Enter you full name: "); 
		String s4= sc.nextLine();
		

		 loggy.info("Enter Your full name : ");
			loggy.info("full name is:"+s4);
		//System.out.println(s1 );

		System.out.println("Enter your E-mail address: "); 
		String s5= sc.nextLine();
		
		loggy.info("Enter Your Email : ");
		loggy.info("Email is:"+s5);
		
		
		/*System.out.println("Enter Account Type: ");  
		String account_type1=sc.nextLine();
		
		System.out.println("Enter Account Number: ");  
		double account_number=sc.nextDouble();
		
		//System.out.println(s2 );
		System.out.println("Enter your Balance: ");  
		balance=sc.nextLong();*/
		

		try(Connection connection = DriverManager.getConnection(url,username,password)){
			String sql = " SELECT * FROM bank_info3 where full_name=? and e_mail=?" ;
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, s4);
			ps.setString(2, s5);
			ResultSet rs = ps.executeQuery();
			//int i=0;
			
			while(rs.next()) {
				
				 full_name1=rs.getString("full_name");
				 e_mail1=rs.getString("e_mail");
				 
				
				
				}
			 if(s4.equals(full_name1) && s5.equals(e_mail1)) {
					System.out.println("You registration cannot be complet a customer under this information exist already");
					loggy.info("You registration cannot be complet a customer under this information exist already");
					
					
					//break;
			 }
					
			    else
			    {
			        System.out.println("Congratualation your registration is complete.");
			        loggy.info("Congratualation your registration is complete.");
					
			    }
			
			
			
			
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return null;
		
	}
	public void customerBalance() {
		loggy.setLevel(Level.ALL);
		System.out.println("Enter your  full name  " );
		  loggy.info("Enter your  full name  ");
		
		  String name2= sc.nextLine();
		String name1="";
		//String [] a = {"first_name", "last_name", "account_type", "user_name","password"};
		
		//Registration r=new Registration();
		
		try(Connection connection = DriverManager.getConnection(url,username,password)){
			String sql = " SELECT * FROM bank_info3 where full_name =?";
			//System.out.println("name 2 is :" + name2);
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, name2);
			ResultSet rs = ps.executeQuery();
			//int i=0;
			//System.out.println("Enter your name 1111 " );
			while(rs.next()) {
				
				name1=rs.getString("full_name");
				//String account_type1=rs.getString("account_type1");
				//double account_number=rs.getDouble("account_number");
				balance=rs.getLong("balance");
				
				
				 //System.out.println( "Name is:- " + name1  );
				//System.out.println( "account Type is:- " + account_type1);
				// System.out.println( "My account number is:- " + account_number);
				
				
				
				

				}
			if(name2.equals(name1)) {
				System.out.println( "My balance is: " + balance);
				 loggy.info( "My balance is: " + balance);
				
			}
			else {
				System.out.println( "Enter the correct name ");
				 loggy.info( "Enter the correct name ");
					
				
			}
}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
	}
	
	public   void displayAccount()  {
		loggy.setLevel(Level.ALL);
		System.out.println("The List of all the customer is  " );
		 loggy.info( "The List of all the customer is  ");
		//String [] a = {"first_name", "last_name", "account_type", "user_name","password"};
		
		//Registration r=new Registration();
		
		try(Connection connection = DriverManager.getConnection(url,username,password)){
			String sql = " SELECT * FROM bank_info3 " ;
			//String sql = " SELECT name1 from bank_info2 ";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			//int i=0;
			
			while(rs.next()) {
				
				full_name=rs.getString("full_name");
				e_mail=rs.getString("e_mail");
				String account_type1=rs.getString("account_type1");
				double account_number=rs.getDouble("account_number");
				balance=rs.getLong("balance");
				
				
				 System.out.println( "Name is:- " + full_name  );
				 loggy.info( "Name is:- " + full_name);
				
				 System.out.println( "Email adrress  is:- " + e_mail  );
				 loggy.info( "Email adrress  is:- " + e_mail );
				
				 System.out.println( "account Type is:- " + account_type1);
				 loggy.info("account Type is:- " + account_type1);
				 
				 System.out.println( "My account number is:- " + account_number);
				 loggy.info( "My account number is:- " + account_number);
				
				 System.out.println( "My balance is:- " + balance);
				 loggy.info(  "My balance is:- " + balance);
				

				
				
				//i++;
			}
			
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	public  void deposit() {
		loggy.setLevel(Level.ALL);
		customerBalance();
		System.out.println("Enter the amount you want to deposit: ");
		 loggy.info( "Enter the amount you want to deposit: ");
		 
		 amount= sc.nextInt();
		 
		 if(amount<0) {
				System.out.println("your transaction cana not be completed deposit of negative money ");
				 loggy.info( "your transaction cana not be completed deposit of negative money ");
				
			}
		 else {
			 

			 balance+= amount;
			 System.out.println("Your new balance is : " + balance);
			 loggy.info("Your new balance is : " + balance);
				
		 }
		 
		 
		 
	}
	public  void withdrawl() {
		loggy.setLevel(Level.ALL);
		customerBalance();
		double amou;
		System.out.println("Enter the amount you want to withdraw: ");
		 loggy.info("Enter the amount you want to withdraw: ");
		amou =sc.nextDouble();
		
		if (amou<0) {
			System.out.println("your transaction cannot be completed because withdrawl of negative money. ");
			loggy.info("your transaction cannot be completed because withdrawl of negative money. ");
		}
		else if(balance<= amou) {
			System.out.println("Error Insuffisient Found your transaction cana not be completed");
			 loggy.info("Error Insuffisient Found your transaction cana not be completed");
		}
			
			
		else {
			
			balance-=amou;
			
			System.out.println("Balance after withdrawl is: " + balance);
			 loggy.info("Balance after withdrawl is: " + balance);
			
		}
		
	}
	
	public void transfer () {
		loggy.setLevel(Level.ALL);
		customerBalance();
		int amount;
		System.out.println("Enter the amount you want to transfer: ");
		loggy.info("Enter the amount you want to transfer: ");
		
		amount =sc.nextInt();
		
		if(amount<0) {
			System.out.println("Invalid amount: ");
			loggy.info("Invalid amount: ");
		}
		
		else if(balance< amount) {
			System.out.println("Error Insuffisient Found: ");
			loggy.info("Error Insuffisient Found: ");
		}
			
			
		else {
			
			balance -=amount;
			
			System.out.println("The money is succcessfuly transfer: " );
			loggy.info("The money is succcessfuly transfer: " );
			System.out.println("Your balance now is: " + balance);
			loggy.info("Your balance now is: " + balance);
			
		}
		
		
	}
	public void accepTransfer() {
		loggy.setLevel(Level.ALL);
		customerBalance();
		double amount;
		System.out.println("That's the amount that will transfer to your account ");
		loggy.info("That's the amount that will transfer to your account ");
		amount =sc.nextDouble();
		
		
		balance+= amount;
		
		System.out.println("The money is succcessfuly transfer to your account: ");
		loggy.info("The money is succcessfuly transfer to your account: ");
		
		System.out.println("your balance now s: "+ balance);
		loggy.info("Your balance now is: " + balance);
		
		
		
		
	}
	
	
	
	
	

}
