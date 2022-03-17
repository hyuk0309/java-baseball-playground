package baseball;

public class GameResult {

    private int strike;
    private int ball;

    public int countStrike() {
        return strike;
    }

    public int countBall() {
        return ball;
    }

    public void report(BallStatus result) {
        if (result.isStrike(result)) {
            strike++;
        }
        if (result.isBall(result)) {
            ball++;
        }
    }

    public boolean isGameEnd() {
        if(strike == 3) {
            return true;
        }
        return false;
    }
}
