package com.presentation;

import java.util.Scanner;

import com.models.Registration;
import com.repo.DAOBankImp;
import com.repo.DAOImp;
import com.repo.DAOLoginImp;

public class MainMenu {
	
	
	
	
	
	//Registration s= new Registration();
	
	Scanner sc =new Scanner(System.in);
	
	
	public  void display() {
		
		
		
		
		
		
		
		System.out.println("Enter your First name: " );
		String s=  sc.nextLine();
		
		//System.out.println(s );
		
		System.out.println("Enter you Last name: " );
		String s1=  sc.nextLine();
		
		//System.out.println(s1 );
		
		System.out.println("Enter you account type:");
		String s2=  sc.nextLine();
		
		//System.out.println(s2 );
		
		System.out.println("Enter your user name: " );
		String s3=  sc.nextLine();
		
		//System.out.println(s3 );
		
		System.out.println("Enter your password: " );
		String s4=  sc.nextLine();
		
		
		
		System.out.println("Your registration is compleet . " );
		//System.out.println("Your registration is compleet . " );
		
			
			
			
		}
	
	public void bankShow() {
		//int n;
		System.out.println("Welcom to my Banking System Application");
		
		System.out.println("please select your option from the menu");
		
		
		//boolean running=true;
		DAOImp a= new DAOImp();
		DAOLoginImp b=new DAOLoginImp();
		DAOBankImp c=new DAOBankImp();
	
			System.out.println("1) register for a customer account ");  
			System.out.println("2) apply for join account ");
			System.out.println("3) Login ");
			System.out.println("4) Validate the Login ");
			System.out.println("5) Apply for new bank account");
			System.out.println("6) view balance of a specific account");
			System.out.println("7) make withdrawl ");
			System.out.println("8) make deposit");
			System.out.println("9)view customer's bank account ");
			System.out.println("10)customer transfer money to another count ");
			System.out.println("11)customer accept money transfer from another account ");
			System.out.println("12) Employee view a log of all transaction");
			
			
			
			String input=sc.nextLine();
			switch(input) {
			case"1":
			a.insert();
			break;
			case"2":
				//a.insert();
				break;
			case"3":
				b.insert();
				break;
			case"4":
				b.iselect();
				break;
			case"5":
				c.openAccount();
				break;
			case"6":
				c.customerBalance();
				break;
			case"7":
				c.withdrawl();
				break;
			case"8":
				c.deposit();
				break;
			case"9":
				c.displayAccount();;
				break;
			case"10":
				c.transfer();
				break;
			case"11":
				c.accepTransfer();
				break;
			case"12":
				b.viewLog();
				
				break;
			}
			
		}
		
		
	}
	
	
	





	
	
	
		
	

	

