package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getFortuneService());
		
		context.close();

	}

}
