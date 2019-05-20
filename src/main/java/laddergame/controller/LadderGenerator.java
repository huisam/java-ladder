package laddergame.controller;

import laddergame.controller.rule.Rule;
import laddergame.domain.Ladder;

public class LadderGenerator {
    public static Ladder generateLadder(int height, int numberOfPerson, Rule rule) {
        Ladder ladder = new Ladder();
        for (int i = 0; i < height; i++) {
            ladder.addLines(LineGenerator.lineGenerate(rule, numberOfPerson));
        }
        return ladder;
    }
}
