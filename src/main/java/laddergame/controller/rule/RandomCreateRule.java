package laddergame.controller.rule;

public class RandomCreateRule implements Rule {
    @Override
    public boolean canCreate() {
        return RandomGenerator.makeTrueOrFalse();
    }
}
