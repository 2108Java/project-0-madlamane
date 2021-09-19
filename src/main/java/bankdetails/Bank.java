package bankdetails;

import java.util.Scanner;

public class Bank {
	Scanner sc=new Scanner(System.in);
	private String account_number;
	private String name;
	private String account_type;
	private long balance;
	private long amount;
	public void openAccount() {
		System.out.print("Enter Account Number: ");  
		account_number=sc.nextLine();
		
		System.out.print("Enter your Name: ");  
		name=sc.nextLine();
		
		System.out.print("Enter Account Type: ");  
		account_type=sc.nextLine();
		
		System.out.print("Enter your Balance: ");  
		balance=sc.nextLong();
		
		System.out.print("you are successfully open your new account ");  
		
		
		}
	
	public void displayAccount() {
		
		
		 
	        System.out.println("Account number is: " + account_number); 
	        System.out.println("Name of account holder: " + name);  
	        System.out.println("Account type: " + account_type);  
	        System.out.println("Balance: " + balance);
		
	}
	
	public void deposit() {
		
		 System.out.println("Enter the amount you want to deposit: ");
		 amount= sc.nextInt();
		 
		 balance+= amount;
		 
		 
		 System.out.println("Your new balance is : " + balance);
		 
		
	}
	public void withdrawal() {
		double amou;
		System.out.println("Enter the amount you want to withdraw: ");
		amou =sc.nextDouble();
		
		if(balance>= amou) {
			balance-=amou;
			
			System.out.println("Balance after withdrawl is: " + balance);
			
		}
		
	}
	
	

}
