package com.bean.anotataion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("com/bean/anotataion/bean.anotation.xml");
Office of=(Office) context.getBean("office");
System.out.println(of);

	}

}
