package com.lavesh.security;

import com.lavesh.aspect.Userdetails;

public class Authentication {

	private static Authentication getAuthentication = new Authentication();

	ThreadLocal<Userdetails> userData;

	private Authentication() {

		userData = new ThreadLocal<Userdetails>();
	}

	public static Authentication getInstance() {
		return getAuthentication;
	}

	public void setDetails(String username, String password) {

		userData.set(new Userdetails(username, password));
	}

	public Userdetails getUserDeati() {
		if (userData == null) {
			throw new IllegalArgumentException("not found");
		}

		return userData.get();
	}

}
