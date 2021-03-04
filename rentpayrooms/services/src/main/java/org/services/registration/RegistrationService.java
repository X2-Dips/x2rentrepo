package org.services.registration;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.services.entity.UserRegistration;
import org.services.form.UserRegistrationForm;
import org.services.repository.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
	@Autowired
	private UserRegistrationRepository userRegistrationRepository;
	
	public void saveUser(UserRegistrationForm form) throws ParseException {
		UserRegistration userRegistration=new UserRegistration();
		userRegistration.setFristName(form.getFirstName());
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date date =format.parse(form.getDob());
		java.sql.Date dob=new java.sql.Date(date.getTime());
		
		userRegistration.setFristName(form.getFirstName());
		userRegistration.setLastName(form.getLastName());
		userRegistration.setDob(dob);
		userRegistration.setEmailId(form.getEmailId());
		userRegistration.setPassword(form.getPassword());
		
		userRegistrationRepository.save(userRegistration);
	}
}
