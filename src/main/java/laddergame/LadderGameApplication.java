package laddergame;

import laddergame.controller.LadderGame;
import laddergame.controller.LadderGameResult;
import laddergame.controller.Maker;
import laddergame.controller.rule.RandomCreateRule;
import laddergame.util.InputView;
import laddergame.util.OutputView;

public class LadderGameApplication {
    public static void main(String[] args) {
        LadderGame ladderGame = new LadderGame(Maker.makeMembers(), new RandomCreateRule());

        LadderGameResult ladderGameResult = ladderGame.startGame();

        OutputView.outputLadderGameResult(InputView.inputWantResult(), ladderGameResult);
    }
}
