package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach trackCoach = context.getBean("trackCoach", Coach.class);
        Coach baseballCoach = context.getBean("baseballCoach", Coach.class);

        //call methods on the bean
        System.out.println(trackCoach.getDailyWorkout());
        System.out.println(baseballCoach.getDailyWorkout());

        System.out.println(baseballCoach.getDailyFortune());
        System.out.println(trackCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
