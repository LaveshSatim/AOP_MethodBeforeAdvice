package com.lavesh.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lavesh.security.Authentication;

@Aspect
@Component
public class Aspect101 {

	@Autowired
	private Authentication authentication;

	@Before("within(com.lavesh.bean.*)")
	public void getbefore(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		Userdetails userdetails = authentication.getUserDeati();

		if (!(userdetails.getName().equals((String) args[0]) && userdetails.getPassword().equals((String) args[1]))) {

			throw new RuntimeException("not matching credentials");
		}

		System.out.println("loggedin  : : ");

	}
}
