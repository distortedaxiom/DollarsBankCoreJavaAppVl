package com.dollarsbanks.ui;

import java.util.Scanner;

import com.dollarsbank.controller.UserController;

public class UserUi {

	public static void Run() {
		
		System.out.println("\nWelcome to DOLLARBANKS \n");
		System.out.println("Please select one of the option below\n");
		System.out.println("-----------------------------------------\n");
		System.out.println("1. Create New Account");
		System.out.println("2. Login");
		System.out.println("3. Exit");
		
		
		System.out.print("> ");
		
		boolean isRunning = true;
		
		while(isRunning == true) {
			
			Scanner userInput = new Scanner(System.in);
			String entry = userInput.nextLine();
			
			switch(entry) {
				case "1":
					UserController.createUser(userInput);
					break;
				case "2":
					UserController.loginUser(userInput);
					break;
				case "3":
					System.out.println("\nExiting...");
					isRunning = false;
					break;
				default:
					System.out.println("\nCommand not found\n");
					System.out.print("> ");
					break;
			}
		}
		
	}
	
}
