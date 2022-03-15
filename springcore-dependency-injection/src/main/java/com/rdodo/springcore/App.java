package com.rdodo.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.rdodo.springcore.model.Address;
import com.rdodo.springcore.model.Customer;

/**
 * Demo for Dependency Injection
 * Setter Dependency
 * Construtor Dependency
 * 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	//BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
    	
		/*
		 * Customer customer = beanFactory.getBean("customer", Customer.class); Address
		 * address = beanFactory.getBean("address", Address.class);
		 */    	
    	//System.out.println (customer);
    	
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml"); 
    	Customer customer = applicationContext.getBean("customer", Customer.class);
    	System.out.println (customer);
    	
    
    }
}
