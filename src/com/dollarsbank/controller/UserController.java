package com.dollarsbank.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dollarsbank.model.Account;
import com.dollarsbank.model.User;
import com.dollarsbanks.util.CurrentData;
import com.dollarsbanks.util.DataInstance;

public class UserController {

	public static void createUser(Scanner sc) {
		
		String username = null;
		String password = null;
		String name = null;
		String address = null;
		List<Account> accounts = null;
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
			
			CurrentData.data.addUser(new User(username, password, name, address, accounts));
			
			CurrentData.data.getCurrentUsers().forEach((n) -> System.out.println(n.toString()));;
			
		}
		
		
		
	}
	
	public static void loginUser(Scanner sc) {
		
	}
	
}
