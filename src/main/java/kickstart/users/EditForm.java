package kickstart.users;

import kickstart.utils.CheckEqual;
import kickstart.utils.Password;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@CheckEqual(field1 = "password", field2 = "passwordValidation", allowNull = true)
public class EditForm {
	@NotEmpty(message = "{RegistrationForm.NotEmpty}")
	//siehe https://www.ietf.org/rfc/rfc5322.txt
	@Pattern(regexp = "(?:[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+)*" +
			"|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]" +
			"|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")" +
			"@(?:(?:[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?\\.)+[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?" +
			"|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}" +
			"(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])" +
			"|[a-zA-Z0-9-]*[a-zA-Z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]" +
			"|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])",
			message = "{RegistrationForm.InvalidEmail}")
	private final String email;

	@Password(message = "{RegistrationForm.InvalidPassword}", allowEmpty = true)
	private final String password;

	private final String passwordValidation;

	@NotEmpty(message = "{RegistrationForm.NotEmpty}")
	private final String lastname;

	@NotEmpty(message = "{RegistrationForm.NotEmpty}")
	private final String address;

	@NotEmpty(message = "{RegistrationForm.NotEmpty}")
	@Pattern(regexp = "[0-9]{5}", message = "{RegistrationForm.InvalidZip}")
	private final String zip;

	@NotEmpty(message = "{RegistrationForm.NotEmpty}")
	private final String city;

	public EditForm(String email, String password, String passwordValidation,
					String lastname, String address, String zip, String city) {
		this.email = email;
		this.password = password;
		this.passwordValidation = passwordValidation;
		this.lastname = lastname;
		this.address = address;
		this.zip = zip;
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getPasswordValidation() {
		return passwordValidation;
	}

	public String getLastname() {
		return lastname;
	}

	public String getAddress() {
		return address;
	}

	public String getZip() {
		return zip;
	}

	public String getCity() {
		return city;
	}
}
