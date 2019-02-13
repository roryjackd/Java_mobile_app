package com.appsdeveloperblog.app.ws.shared.dto;

import java.io.Serializable;

public class UserDto implements Serializable {

	private long id;		
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String encryptedPassword;
	private String emailVerificationToken;
	private String emailVerificationStatus;


}
