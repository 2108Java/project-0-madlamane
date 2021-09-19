package com.models;

public class Customer {
	
	
	private double account_number;
	
	private String name1;
	private String account_type;
	private long balance;
	
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(double account_number, String name, String account_type, long balance) {
		super();
		this.account_number = account_number;
		this.name1 = name1;
		this.account_type = account_type;
		this.balance = balance;
	}
	
	
	public double getAccount_number() {
		return account_number;
	}
	public void setAccount_number(double account_number) {
		this.account_number = account_number;
	}
	public String getName() {
		return name1;
	}
	public void setName(String name) {
		this.name1 = name1;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	

}
