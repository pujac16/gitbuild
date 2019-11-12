package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationcontext.xml");
		
		//retrieve bean from spring container
		Coach theCoach=context.getBean("mycoach",Coach.class);
	
		System.out.println(theCoach.getDailyWorkout());
	
		//close the context
	context.close();	
	}

}
