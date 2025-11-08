package com.userapp.service;

import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.exception.UserExistsException;

public interface IValidationService {
	
	boolean validatePassword(String password) throws TooShortException,TooLongException;
	
	boolean validateusername(String username) throws UserExistsException;

}
