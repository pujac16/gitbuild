package com.springdemo;

public class MyApp 
{
	public static void main(String[] args)
	{
		//create the object
		//BaseballCoach theCoach=new BaseballCoach();
		
		//create the object
		//Coach theCoach=new BaseballCoach();
		
		//create the object
		Coach theCoach =new TrackCoach();
		
		//use the object
		System.out.println(theCoach.getDailyWorkout());
		
	}
}
