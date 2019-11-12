package com.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneservice;
	
	public TrackCoach() 
	{
		
	}
	public TrackCoach(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getdailyFortune() {
		return "just do it: " +fortuneservice.getfortune();
	}

	//add an init method
	public void doMyStartupStuff() {
		System.out.println("Trackcoach: inside method domystartupstuff");
	} 
	
	//add a destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("Trackcoach: inside method doMyCleanupStuffYoYo");
	} 
	
}











