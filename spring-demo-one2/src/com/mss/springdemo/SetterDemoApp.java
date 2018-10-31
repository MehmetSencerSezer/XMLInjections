 package com.mss.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hayvan myCricketCoach = context.getBean("myCoach2",Hayvan.class);
//		System.out.println(myCricketCoach.getDailyFortune());
//		System.out.println(myCricketCoach.getDailyWorkout());
		context.close();

	}

}
