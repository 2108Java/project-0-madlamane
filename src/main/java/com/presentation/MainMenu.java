package com.presentation;

import java.util.Scanner;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.models.Registration;
import com.repo.DAOBankImp;
import com.repo.DAOImp;
import com.repo.DAOLoginImp;

public class MainMenu {
	
	private static final Logger loggy = Logger.getLogger(MainMenu.class);
	
	
	
	//Registration s= new Registration();
	
	Scanner sc =new Scanner(System.in);
	
	
	
	public void bankShow() {
		
		loggy.setLevel(Level.ALL);
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
			loggy.info("User put in the option :" + input);
			
			loggy.setLevel(Level.WARN);
			switch(input) {
			case"1":
			a.insert();
			loggy.info("User selected 1");
			break;
			case"2":
				//a.insert();
				loggy.info("User selected 2");
				//a.joinAccount();
				c.joinAccount();
				break;
			case"3":
				loggy.info("User selected 3");
				b.insert();
				break;
			case"4":
				loggy.info("User selected 4");
				b.iselect();
				break;
			case"5":
				loggy.info("User selected 5");
				c.openAccount();
				break;
			case"6":
				loggy.info("User selected 6");
				c.customerBalance();
				break;
			case"7":
				loggy.info("User selected 7");
				c.withdrawl();
				break;
			case"8":
				loggy.info("User selected 8");
				c.deposit();
				break;
			case"9":
				loggy.info("User selected 9");
				c.displayAccount();;
				break;
			case"10":
				loggy.info("User selected 10");
				c.transfer();
				break;
			case"11":
				loggy.info("User selected 11");
				c.accepTransfer();
				break;
			case"12":
				loggy.info("User selected 12");
				b.viewLog();
				
				break;
			}
			
		}
		
		
	}
	
	
	





	
	
	
		
	

	

