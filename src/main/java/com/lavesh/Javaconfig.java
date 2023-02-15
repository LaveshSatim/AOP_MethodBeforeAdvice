package com.lavesh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.lavesh.security.Authentication;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({ "com.lavesh.aspect", "com.lavesh.bean", "com.lavesh.security" })
public class Javaconfig {

	@Bean
	public Authentication authentication() {
		return Authentication.getInstance();
	}
}
