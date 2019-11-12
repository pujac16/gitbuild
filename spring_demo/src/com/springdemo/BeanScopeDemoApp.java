package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beanscope-applicationcontext.xml");
		
		//retrieve bean from spring container
		Coach theCoach=context.getBean("mycoach",Coach.class);
		
		Coach alphaCoach=context.getBean("mycoach",Coach.class);
	
		//check if they ARe the same
		boolean result= (theCoach == alphaCoach);
	
	//print out the results
		System.out.println("\npointing to the same object" + result);
		
		System.out.println("\nMemory location for thecoach: " + theCoach);
		
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
	
	//close the context
	context.close();	
	}

}
