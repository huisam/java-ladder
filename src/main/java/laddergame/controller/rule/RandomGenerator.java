package laddergame.controller.rule;

import java.util.Random;

public class RandomGenerator {
    public static Boolean makeTrueOrFalse() {
        Random random = new Random();

        return random.nextBoolean();
    }
}
