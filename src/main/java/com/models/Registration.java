package com.models;

public class Registration {
	private String firstname;
	private String lastname;
	//private int phonenumber;
	private String accounttype;
	private String username;
	private String password;
	
	public Registration(String firstname, String lastname,  String accounttype, String username,
			String password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		//this.phonenumber = phonenumber;
		this.accounttype = accounttype;
		this.username = username;
		this.password = password;
	}
	
	
	
	
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
