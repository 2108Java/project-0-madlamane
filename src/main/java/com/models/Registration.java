package com.models;

public class Registration {
	private String first_name;
	private String last_name;
	private String email;
	//private int phonenumber;
	private String account_type;
	private double account_number;
	

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public double getAccount_number() {
		return account_number;
	}

	public void setAccount_number(double account_number) {
		this.account_number = account_number;
	}

	
	
	
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Registration(String first_name, String last_name, String email, String account_type, double account_number) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.account_type = account_type;
		this.account_number = account_number;
	}

	
	

}
