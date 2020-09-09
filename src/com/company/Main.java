package com.company;

public class Main {

    public static void main(String[] args) {
       Coach baseballCoach = new BaseballCoach();
       Coach trackCoach = new TrackCoach();

        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyWorkout());
    }
}
