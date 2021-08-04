package com.dollarsbank.model;

import java.util.List;

public class Account {

	private double balance;
	
	private String type;
	
	private List<Double> transactions;

	public Account(double balance, String type, List<Double> transactions) {
		super();
		this.balance = balance;
		this.type = type;
		this.transactions = transactions;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Double> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Double> transactions) {
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + ", type=" + type + ", transactions=" + transactions + "]";
	}
	
	
	
}
