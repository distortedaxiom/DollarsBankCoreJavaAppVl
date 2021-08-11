package com.dollarsbank.controller;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.dollarsbank.model.User;
import com.dollarsbanks.util.CurrentData;
import com.dollarsbanks.util.DataInstance;

public class BankController {

	public static void deposit(User user) {
		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
		
		System.out.println("How much do you want to deposit?");
		Scanner userInput = new Scanner(System.in);
		double depositAmt = userInput.nextDouble();
		
		List<User> currentUsers = CurrentData.data.getCurrentUsers();
		
		for (User u : currentUsers) {
			if (u.getUsername().equals(user.getUsername())) {
				double balance = u.getAccount().getBalance();
				u.getAccount().setBalance(balance + (double) depositAmt);
				System.out.println(depositAmt + " dollars has been added to your account");
				System.out.println("Your current balance is " + u.getAccount().getBalance());
				u.getAccount().addTransactions(depositAmt + " has been deposited on " + formatter.format(date));
			}
		}
		
	}
	
	public static void withdraw(User user) {
		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		
		System.out.println("How much do you want to withdraw?");	
		Scanner userInput = new Scanner(System.in);
		double withdrawAmt = userInput.nextDouble();
		
		List<User> currentUsers = CurrentData.data.getCurrentUsers();
		
		for (User u : currentUsers) {
			if (u.getUsername().equals(user.getUsername())) {
				double balance = u.getAccount().getBalance();
				u.getAccount().setBalance(balance - (double) withdrawAmt);
				System.out.println(withdrawAmt + " dollars has been withdrawn from your account");
				System.out.println("Your current balance is " + u.getAccount().getBalance());
				u.getAccount().addTransactions(withdrawAmt + " has been withdrawn");
			}
		}
		
	}
	
	public static void fundTransfer(User user) {
		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		
		System.out.println("Which user would you like to transfer your money to?");	
		Scanner userInput = new Scanner(System.in);
		String recipient = userInput.nextLine();
		System.out.println("How much would you like to transfer?");
		double transferAmt = userInput.nextDouble();
		
		List<User> currentUsers = CurrentData.data.getCurrentUsers();
		
		for (User u : currentUsers ) {
			if (u.getUsername().equals(recipient)) {
				double balance = u.getAccount().getBalance();
				u.getAccount().setBalance(balance + transferAmt);
				user.getAccount().setBalance(user.getAccount().getBalance() - transferAmt);
				System.out.println(transferAmt + " has been transferred to the account");
				System.out.println("Your new balance is " + user.getAccount().getBalance());
				user.getAccount().addTransactions(transferAmt + " transferred to " + recipient);
				break;
			}
		}
		
		System.out.println("User not found");
		
	}	
	
	public static void viewTransactions(User user) {
		
		System.out.println("Below are your recent transactions");
		List<User> currentUsers = CurrentData.data.getCurrentUsers();
		
		for (User u : currentUsers ) {
			if (u.getUsername().equals(user.getUsername())) {
				List<String> transactions = u.getAccount().getTransactions();
				Collections.reverse(transactions);
				
				if (transactions.size() > 5) {
					transactions = transactions.subList(0, 5);
				}
				
				transactions.forEach((a) -> {
						System.out.println(a);
				});
				break;
			}
		}
	}
	
	public static void customerInformation(User user) {
		
		System.out.println("Your user information is below");
		
		System.out.println("Username: " + user.getUsername());
		System.out.println("Full Name: " + user.getName());
		System.out.println("Address: " + user.getAddress());
		System.out.println("Balance:" + user.getAccount().getBalance());
		
	}
	
}
