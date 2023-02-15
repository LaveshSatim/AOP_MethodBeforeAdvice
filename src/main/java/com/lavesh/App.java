package com.lavesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lavesh.aspect.Userdetails;
import com.lavesh.bean.Login;
import com.lavesh.security.Authentication;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Javaconfig.class);

		Authentication authentication = context.getBean(Authentication.class);

		authentication.setDetails("lavesh", "lavesh");

		Login login = context.getBean(Login.class);

		login.loginToSystem("lavesh", "lavesh");
	}
}
