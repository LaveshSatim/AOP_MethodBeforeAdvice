package com.lavesh.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class Login {

	public String loginToSystem(String username, String password) {

		System.out.println("logging");

		return "logged in";
	}
}
