package com.rdodo.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.rdodo.springcore.model.Customer;

@Configuration
public class SpringConfiguration {

	@Bean
	public Customer getCustomer() {
		return new Customer();
	}
	
}
