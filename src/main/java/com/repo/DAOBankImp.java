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
	String full_name;
	String e_mail;
	String full_name1;
	String e_mail1;
	
	Scanner sc =new Scanner(System.in);
	
	
	public  boolean openAccount() {
		boolean success = false;
		//1. Connect to database!
		
		System.out.println("Can you fill up this  form  to create new account: ");
		
		try(Connection connection = DriverManager.getConnection(url,username,password)){
			
			//2. Write a SQL statement String
			
			
			
			
			//System.out.println(s );
			System.out.println("Enter you full name: "); 
			full_name= sc.nextLine();
			
			//System.out.println(s1 );

			System.out.println("Enter your E-mail address: "); 
			String e_mail= sc.nextLine();
			
			
			System.out.println("Enter Account Type: ");  
			String account_type1=sc.nextLine();
			
			System.out.println("Enter Account Number: ");  
			double account_number=sc.nextDouble();
			
			//System.out.println(s2 );
			System.out.println("Enter your Balance: ");  
			balance=sc.nextLong();
			
			
			System.out.print("you are successfully open your new account ");  
			
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
		System.out.println("Enter you full name: "); 
		full_name= sc.nextLine();
		
		//System.out.println(s1 );

		System.out.println("Enter your E-mail address: "); 
		String e_mail= sc.nextLine();
		
		
		/*System.out.println("Enter Account Type: ");  
		String account_type1=sc.nextLine();
		
		System.out.println("Enter Account Number: ");  
		double account_number=sc.nextDouble();
		
		//System.out.println(s2 );
		System.out.println("Enter your Balance: ");  
		balance=sc.nextLong();*/
		

		try(Connection connection = DriverManager.getConnection(url,username,password)){
			String sql = " SELECT full_name , e_mail FROM bank_info3" ;
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			//int i=0;
			
			while(rs.next()) {
				
				full_name1=rs.getString("full_name");
				e_mail1=rs.getString("e_mail");
				
				
				}
			if(full_name.equals(full_name1) && e_mail.equals(e_mail1)) {
				System.out.println("You registration cannot be complet a customer under this information exist already");
		    }
				
		    else
		    {
		        System.out.println("Congratualation your registration is complete.");
		    }
			
			
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return null;
		
	}
	public void customerBalance() {
		System.out.println("Enter your  full name  " );
		String name2= sc.nextLine();
		//String [] a = {"first_name", "last_name", "account_type", "user_name","password"};
		
		//Registration r=new Registration();
		
		try(Connection connection = DriverManager.getConnection(url,username,password)){
			String sql = " SELECT balance FROM bank_info3 where full_name =?";
			//System.out.println("name 2 is :" + name2);
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, name2);
			ResultSet rs = ps.executeQuery();
			//int i=0;
			//System.out.println("Enter your name 1111 " );
			while(rs.next()) {
				
				//String name1=rs.getString("name1");
				//String account_type1=rs.getString("account_type1");
				//double account_number=rs.getDouble("account_number");
				balance=rs.getLong("balance");
				
				
				 //System.out.println( "Name is:- " + name1  );
				//System.out.println( "account Type is:- " + account_type1);
				// System.out.println( "My account number is:- " + account_number);
				System.out.println( "My balance is: " + balance);

				
				
				//i++;
			}
}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
	}
	
	public   void displayAccount()  {
		System.out.println("The List of all the customer is  " );
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
				 System.out.println( "Email adrress  is:- " + e_mail  );
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

		
	}
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
		if (amou<0) {
			System.out.println("your transaction cannot be completed because withdrawl of negative money. ");
		}
		else if(balance<= amou) {
			System.out.println("Error Insuffisient Found your transaction cana not be completed");
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
		
		if(amount<0) {
			System.out.println("Invalid amount: ");
		}
		
		else if(balance< amount) {
			System.out.println("Error Insuffisient Found: ");
		}
			
			
		else {
			
			balance -=amount;
			
			System.out.println("The money is succcessfuly transfer: " + balance);
			
		}
		
		
	}
	public void accepTransfer(double amount) {
		
		balance+= amount;
		
		System.out.println("The money is succcessfuly transfer to your account: ");
		
		
		
		
	}
	
	
	
	
	

}
