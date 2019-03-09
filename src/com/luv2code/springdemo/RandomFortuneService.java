package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class RandomFortuneService implements FortuneService {
	
	public String [] data = {
			"Today is your lucky day",
			"Today you gonna die",
			"Today buy a lottery ticket"
	};
	
	Random myRandom = new Random();

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		String fortune = data[index];
		return fortune;
	}

}
