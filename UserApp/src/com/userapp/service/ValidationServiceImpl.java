package com.userapp.service;

import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.exception.UserExistsException;

public class ValidationServiceImpl implements IValidationService {

	@Override
	public boolean validatePassword(String password) throws TooShortException, TooLongException {
		if(password.length()<5) {
			throw new TooShortException("Password is small");
		}
		if(password.length()>15) {
			throw new TooLongException("Password is too long");
			}
			return true;
		}

	@Override
	public boolean validateusername(String username) throws UserExistsException {
		String[] usernames = {"Varun","Abhishek","Praveen","Manoj"};
		for ( String user : usernames ) {
		if(user.equalsIgnoreCase(username)) {
			 throw new UserExistsException("User already Exists");
		}
			
	}
		return true;
	}
}
