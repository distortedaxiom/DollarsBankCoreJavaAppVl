package com.dollarsbanks.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dollarsbank.controller.BankController;
import com.dollarsbank.model.User;
import com.dollarsbanks.util.CurrentData;

public class AccountUi {

	public static void Run(User user) {
		
		boolean isRunning = true;
		
		while(isRunning == true) {
			
			User currentUser = user;
			
			List<User> currentUsersList = CurrentData.data.getCurrentUsers();
			
			for (User u : currentUsersList) {
				if (u.getUsername().equals(user.getUsername())) {
					currentUser = u;
				}
			}
			
			System.out.println("\nWelcome to DOLLARBANKS \n");
			System.out.println("Please select one of the option below\n");
			System.out.println("-----------------------------------------\n");
			System.out.println("1. Deposit Amount");
			System.out.println("2. Withdraw Amount");
			System.out.println("3. Funds Transfer");
			System.out.println("4. View 5 recent transactions");
			System.out.println("5. Display customer information");
			System.out.println("6. Sign Out");
			System.out.print("> ");
			
			Scanner userInput = new Scanner(System.in);
			String entry = userInput.nextLine();
			
			switch(entry) {
				case "1":
					BankController.deposit(currentUser);
					break;
				case "2":
					BankController.withdraw(currentUser);
					break;
				case "3":
					BankController.fundTransfer(currentUser);
					break;
				case "4":
					BankController.viewTransactions(currentUser);
					break;
				default:
					System.out.println("\nCommand not found\n");
					System.out.print("> ");
					break;
			}
		}
		
	}
	
}
