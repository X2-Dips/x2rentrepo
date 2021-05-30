package org.services.form;

import org.springframework.stereotype.Component;

@Component
public class UserRegistrationForm {
	private String firstName;
	private String lastName;
	private String dob;
	private String emailId;
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserRegistrationForm [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", emailId="
				+ emailId + ", password=" + password + "]";
	}

}
