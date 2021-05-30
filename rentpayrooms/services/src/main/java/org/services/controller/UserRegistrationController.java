package org.services.controller;

import java.text.ParseException;

import org.services.form.UserRegistrationForm;
import org.services.registration.OTPService;
import org.services.registration.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	@Autowired
	OTPService ser;
	
	
	@RequestMapping(value="/registration",headers="Accept=application/json",method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.CREATED)
	public void registerUser(@RequestBody UserRegistrationForm userRegistrationForm) {
		try {
			registrationService.saveUser(userRegistrationForm);
			ser.send();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
