package com.rdodo.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.rdodo.springcore.model.Address;
import com.rdodo.springcore.model.Customer;

/**
 * Demo for Spring Bean Life Cycle
 * 
 * Start the container or initalize the container -----> Bean Initantiated ----> Dependency Injection ---
 * 
 * -------> Custom init() method -----> Custom utility method -----> Custom destroy() method
 * 
 * If we are creating custom init method then it is compulsory we need to destroy the object. 
 * 
 * Note: We can also use these to interfaces InitializingBean & DisposableBean and override the method
 * to give the implementation for init() and destroy() method. 
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
    	
    	ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
    	Customer customer = applicationContext.getBean("customer", Customer.class);
    	System.out.println(customer);
    	applicationContext.close();
    }
}
