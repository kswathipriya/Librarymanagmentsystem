package com.dxc.pojos;

public class UserPojo {

	private int id;
	private String name;
	private String password;
	private double balance;
	private int noOfDayTaken;
	private int noOfBookTaken;
	
	public UserPojo() {
	}
	
	public UserPojo(int id, String name, String password, double balance) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void display()
	{
		System.out.println(id+" "+name+" "+balance);
	}
	
	
}
