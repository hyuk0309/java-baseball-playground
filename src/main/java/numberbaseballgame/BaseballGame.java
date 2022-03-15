package numberbaseballgame;

public class BaseballGame {

    private View view = new View();
    private RandomNumGenerator randomNumGenerator = new RandomNumGenerator();

    /*
    public void start() {
        do {
            String randomNum = randomNumGenerator.generateRandomNum();

            String userInput = view.input();
            GameResult gameResult = compareNum(randomNum, userInput);
        } while()
    }*/

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
