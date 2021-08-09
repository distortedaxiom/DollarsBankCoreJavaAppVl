package com.dollarsbank.controller;

import java.util.List;
import java.util.Scanner;

import com.dollarsbank.model.User;
import com.dollarsbanks.util.CurrentData;
import com.dollarsbanks.util.DataInstance;

public class BankController {

	public static void deposit(User user) {
		
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
			}
		}
		
	}
	
}
