package numberbaseballgame;

import numberbaseballgame.view.InputView;
import numberbaseballgame.view.ResultView;
import numberbaseballgame.model.GameResult;

public class BaseballGame {

    private InputView inputView = new InputView();
    private ResultView resultView = new ResultView();
    private RandomNumGenerator randomNumGenerator = new RandomNumGenerator();
    private Compare compare = new Compare();

    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame();
        baseballGame.start();
    }

    public void start() {
        do {
            String randomNum = randomNumGenerator.generateRandomNum();

            System.out.println("randomNum=" + randomNum);

            gameStart(randomNum);

            resultView.askRestart();
        } while (inputView.restart());
    }

    private void gameStart(String randomNum) {
        GameResult gameResult;
        do {
            resultView.askNumber();
            String userInput = inputView.inputNumber();
            gameResult = compare.compareNum(randomNum, userInput);
            resultView.output(gameResult);

        } while(!isGameFinish(gameResult));
    }

    private boolean isGameFinish(GameResult gameResult) {
        if(gameResult.getStrike() == 3) {
            return true;
        }
        return false;
    }
}
