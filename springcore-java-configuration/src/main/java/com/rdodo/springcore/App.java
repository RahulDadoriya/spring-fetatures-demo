package com.rdodo.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.rdodo.springcore.model.Address;
import com.rdodo.springcore.model.Customer;

/**
 * Demo for Spring Core Java Configuration
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
    	
    	Customer customer = applicationContext.getBean(Customer.class);
    	customer.setCustomerId(123);
    	customer.setName("Java Configuration");
    	customer.setAddress(new Address("From Spring Configuration"));
    	
    	System.out.println(customer);
    }
}
