package com.dollarsbank.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.dollarsbank.model.Account;
import com.dollarsbank.model.User;
import com.dollarsbanks.ui.AccountUi;
import com.dollarsbanks.util.CurrentData;
import com.dollarsbanks.util.DataInstance;

public class UserController {

	public static void createUser(Scanner sc) {
		
		String username = null;
		String password = null;
		String name = null;
		String address = null;
		Account account = new Account(0, new ArrayList<>());
		List<User> users = new ArrayList<>();
		
		
		boolean isRunning = true;
		
		while(isRunning) {
			
			System.out.println("Enter Details For New Accounts");
			System.out.println("------------------------------------");
			System.out.println("Customer Name: ");
			name = sc.nextLine();
			System.out.println("Customer Address: ");
			address = sc.nextLine();
			System.out.println("Customer Username: ");
			username = sc.nextLine();
			System.out.println("Customer Password: ");
			password = sc.nextLine();
			
			CurrentData.data.addUser(new User(username, password, name, address, account));
			System.out.println("Account created successfully");
			break;
		}
		
	}
	
	public static void loginUser(Scanner sc) {
		
		String username = null;
		String password = null;
		
		boolean isRunning = true;
		
		while(isRunning) {
			
			boolean isLoggedIn = false;
			
			System.out.println("Enter your login information below");
			System.out.println("------------------------------------");
			System.out.println("Customer Username: ");
			username = sc.nextLine();
			System.out.println("Customer Password: ");
			password = sc.nextLine();
			
			List<User> currentUsers = CurrentData.data.getCurrentUsers();
			
			Iterator<User> userIterator = currentUsers.iterator();
			
			while(userIterator.hasNext()) {
				User currentUser = userIterator.next();
				String currentUsername = currentUser.getUsername();
				String currentPassword = currentUser.getPassword();
				if (currentUsername.equals(username) && currentPassword.equals(password)) {
					System.out.println("Login Success");
					isLoggedIn = true;
					isRunning = false;
					AccountUi.Run(currentUser);
					break;
				}
			}
			
			if (isLoggedIn == false) {
				System.out.println("Invalid username and password");
			}
			
			isRunning = false;
			
		}
		
	}
	
}
