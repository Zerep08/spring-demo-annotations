package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Nandale nadale nadale...";
	}

	@Override
	public String getFortuneService() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	

}
