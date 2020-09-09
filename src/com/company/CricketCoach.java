package com.company;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String email;
    private String team;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("Cricket coach email setter");

        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Cricket coach team setter");

        this.team = team;
    }

    public CricketCoach() {
        System.out.println("Cricket coach constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket coach setter");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practise fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
