package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        @SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        Student student=(Student) context.getBean("student");
        Student student1=(Student) context.getBean("student1");
        System.out.println(student);
        System.out.println(student1);
    }
}
