package com.ajia.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ajia.dto.Customer;
import com.ajia.service.CustomerService;


public class TestCustomer {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		filmAopOpertor(ctx);
	}

	
	private static void filmAopOpertor(ApplicationContext ctx) {
		CustomerService customerServiceImpl = (CustomerService) ctx.getBean("customerServiceImpl");
		Customer customer = (Customer)customerServiceImpl.getLastCustomer();
		System.out.println("-----"+customer.getFirstName());
	}


}
