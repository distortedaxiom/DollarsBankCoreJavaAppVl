package com.dollarsbanks.util;

import java.util.ArrayList;
import java.util.List;

import com.dollarsbank.model.Account;
import com.dollarsbank.model.User;

public class DataInstance {

	private List<User> currentUsers = new ArrayList<>();
	
	private List<Account> currentAccounts = new ArrayList<>() ;

	public DataInstance(ArrayList<User> currentUsers, ArrayList<Account> currentAccounts) {
		super();
	}
	
	public void addUser(User user) {
		currentUsers.add(user);
	}
	
	public List<User> getCurrentUsers() {
		return currentUsers;
	}

	public void setCurrentUsers(ArrayList<User> currentUsers) {
		this.currentUsers = currentUsers;
	}

	public List<Account> getCurrentAccounts() {
		return currentAccounts;
	}

	public void setCurrentAccounts(ArrayList<Account> currentAccounts) {
		this.currentAccounts = currentAccounts;
	}

	@Override
	public String toString() {
		return "DataInstance [currentUsers=" + currentUsers + ", currentAccounts=" + currentAccounts + "]";
	}
	
}
