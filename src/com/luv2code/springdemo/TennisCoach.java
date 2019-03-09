package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	FortuneService fortune;
	
	
	/*
	@Autowired
	public TennisCoach(FortuneService fortune) {
		this.fortune = fortune;
	}
*/
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand ball";
	}

	@Override
	public String getFortuneService() {
		return fortune.getFortune();
	}

}
