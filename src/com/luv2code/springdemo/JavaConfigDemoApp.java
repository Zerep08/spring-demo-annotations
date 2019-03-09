package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getFortuneService());
		
		System.out.println(theCoach.getEmail());
		
		System.out.println(theCoach.getTeam());
		
		context.close();

	}

}
