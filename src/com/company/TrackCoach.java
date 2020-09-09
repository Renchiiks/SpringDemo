package com.company;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Go to the jim for 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it " + fortuneService.getFortune();
    }
}
