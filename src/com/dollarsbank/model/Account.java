package com.dollarsbank.model;

import java.util.List;

public class Account {

	private double balance;
	
	private List<String> transactions;

	public Account(double balance, List<String> transactions) {
		super();
		this.balance = balance;
		this.transactions = transactions;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


	public List<String> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<String> transactions) {
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + ", transactions=" + transactions + "]";
	}
	
	
	
}
