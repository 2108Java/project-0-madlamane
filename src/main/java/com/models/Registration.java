package com.models;

public class Registration {
	private String first_name;
	private String last_name;
	//private int phonenumber;
	private String account_type;
	private String user_name;
	private String password;
	
	public Registration(String first_name, String last_name,  String account_type, String user_name,
			String password) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		//this.phonenumber = phonenumber;
		this.account_type = account_type;
		this.user_name = user_name;
		this.password = password;
	}
	
	
	
	
	
	
	public Registration() {
		// TODO Auto-generated constructor stub
	}






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
	
	public String getAccount_type() {
		return account_type;
	}
	public void setAccounttype(String account_type) {
		this.account_type = account_type;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
