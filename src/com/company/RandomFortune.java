package com.company;

import java.util.Random;

public class RandomFortune implements FortuneService {
    private String[] randomFortunes = {"You should help someone",
            "Some one will take care of you",
            "What ever rains you will get trough"};

    @Override
    public String getFortune() {
        Random random = new Random();
        int number = random.nextInt(randomFortunes.length);
        return switch (number) {
            case 1 -> randomFortunes[1];
            case 2 -> randomFortunes[2];
            case 3 -> randomFortunes[3];
            default -> null;
        };
    }
}
