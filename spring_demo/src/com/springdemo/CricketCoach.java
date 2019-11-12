package com.springdemo;

public class CricketCoach implements Coach {

	private  FortuneService fortuneservice;
	
	//add new fields for email address and team
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("cricketcoach: inside setter method -setemailaddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("cricketcoach: inside setter method -setteam");
		this.team = team;
	}

	//create a no-arg constructor
	public CricketCoach()
	{
		System.out.println("cricketcoach: inside no-arg constructor");
	}
	
	//our setter method
	public void setFortuneservice(FortuneService fortuneservice) {
		System.out.println("cricketcoach: inside setter method -setFortuneservice");
		this.fortuneservice = fortuneservice;
	}



	@Override
	public String getDailyWorkout() {

		return "practice fast bowling for 15 minutes";
	}

	@Override
	public String getdailyFortune() {
		return fortuneservice.getfortune();
	}

}
