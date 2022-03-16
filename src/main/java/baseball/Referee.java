package baseball;

public class Referee {

    public GameResult play(Balls com, Balls player) {
        GameResult gameResult = new GameResult();

        for (int i = 0; i < 3; ++i) {
            Ball ball = player.bringBall(i);
            BallStatus result = com.play(i, ball);
            gameResult.report(result);
        }

        return gameResult;
    }
}
