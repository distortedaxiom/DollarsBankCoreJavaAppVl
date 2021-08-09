package com.dollarsbank.model;

import java.util.List;

public class User {
	
	private String username;
	
	private String password;
	
	private String name;
	
	private String address;
	
	private Account account;
	
	private int id;
	
	private static int count = 0;

	public User(String username, String password, String name, String address,
			Account account) {
		super();
		count = count + 1;
		this.id = count;
		this.username = username;
		this.password = password;
		this.name = name;
		this.address = address;
		this.account = account;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", name=" + name + ", address=" + address
				+ ", account=" + account + ", id=" + id + "]";
	}
	
	
}
