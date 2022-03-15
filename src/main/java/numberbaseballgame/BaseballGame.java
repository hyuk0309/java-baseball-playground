package numberbaseballgame;

import numberbaseballgame.View.InputView;
import numberbaseballgame.View.ResultView;

public class BaseballGame {

    private InputView inputView = new InputView();
    private ResultView resultView = new ResultView();
    private RandomNumGenerator randomNumGenerator = new RandomNumGenerator();

    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame();
        baseballGame.start();
    }

    public void start() {
        do {
            String randomNum = randomNumGenerator.generateRandomNum();

            System.out.println(randomNum);

            while (true) {
                String userInput = inputView.input();
                GameResult gameResult = compareNum(randomNum, userInput);
                resultView.output(gameResult);

                if (gameResult.getStrike() == 3) {
                    break;
                }
            }
            resultView.askRestart();
        } while (inputView.restart());
    }

    public GameResult compareNum(String randomNum, String userInput) {
        char[] randomNums = randomNum.toCharArray();
        char[] userNums = userInput.toCharArray();

        int strike = countStrike(randomNums, userNums);
        int ball = countBall(randomNums, userNums);

        return new GameResult(strike, ball);
    }

    private int countBall(char[] randomNums, char[] userNums) {

        int ball = 0;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (i == j) {
                    continue;
                }
                if (userNums[i] == randomNums[j]) {
                    ball++;
                    break;
                }
            }
        }
        return ball;
    }

    private int countStrike(char[] randomNums, char[] userNums) {
        int strike = 0;

        for (int i = 0; i < 3; ++i) {
            if (randomNums[i] == userNums[i]) {
                strike++;
            }
        }
        return strike;
    }


}
