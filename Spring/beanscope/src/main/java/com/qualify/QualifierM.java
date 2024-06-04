package com.qualify;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierM {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("com/qualify/qualifier.xml");
Shop sh=context.getBean("shop",Shop.class);
System.out.println(sh);
	}

}
