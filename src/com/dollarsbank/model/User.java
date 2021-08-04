package com.dollarsbank.model;

import java.util.List;

public class User {
	
	private String username;
	
	private String password;
	
	private String name;
	
	private String address;
	
	private List<Account> account;

	public User(String username, String password, String name, String address,
			List<Account> account) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.address = address;
		this.account = account;
	}
	
}
