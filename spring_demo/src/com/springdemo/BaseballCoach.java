package com.springdemo;

public class BaseballCoach implements Coach{
	
	//define a private field for the dependency
	private FortuneService fortuneservice;
	
	//define a constructor for dependency injection
	public BaseballCoach( FortuneService thefortuneservice)
	{
		fortuneservice = thefortuneservice;
	}

	@Override
	public String getDailyWorkout()
	{
		return "spend 30 minutes on batting practices";
	}


	@Override
	public String getdailyFortune() {
		
		//use my fortuneservice to get a fortune
		return fortuneservice.getfortune();
	}

}
