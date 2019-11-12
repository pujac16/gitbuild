package com.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getfortune() {
		
		return "Today is your lucky day";
	}
	

}
