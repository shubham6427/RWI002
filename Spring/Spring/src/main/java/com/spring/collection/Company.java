package com.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Company {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/collection/collection.xml");
Employee em=(Employee) context.getBean("em");


System.out.println(em.getName());
System.out.println(em.getPhones());
System.out.println(em.getAddress());
System.out.println(em.getProjects());
	}

}
