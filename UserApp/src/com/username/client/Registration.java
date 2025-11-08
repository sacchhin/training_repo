package com.username.client;

import java.util.Scanner;

import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.exception.UserExistsException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

public class Registration {

	public static void main(String[] args) {
		
		IValidationService iValidationService = new ValidationServiceImpl();
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your name");
		String username = sc.nextLine();
		
		try {
			if(iValidationService.validateusername(username)) {
				System.out.println("Enter the password");
				String password = sc.nextLine();
				if(iValidationService.validatePassword(password)) {
					System.out.println("You are registred");
				}
			}
		}
		catch (UserExistsException e) {
			System.out.println("Issue with username:" +e.getMessage());

		} catch (TooShortException | TooLongException e) {
			System.out.println("Issue with password" + e.getMessage());
		
		}
	}
}
	

