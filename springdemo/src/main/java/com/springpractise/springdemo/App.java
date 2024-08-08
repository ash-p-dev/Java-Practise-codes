package com.springpractise.springdemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Retrieve beans from Spring container
    	Student student1 = (Student) context.getBean("student1");
    	System.out.println(student1);

    	a aref = (a) context.getBean("aref");
    	System.out.println(aref);
    }
}
