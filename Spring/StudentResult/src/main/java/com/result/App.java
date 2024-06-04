package com.result;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
      
      	@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("result.xml");
      	Student st= (Student) context.getBean("st");
      	System.out.println(st);
    }
}
