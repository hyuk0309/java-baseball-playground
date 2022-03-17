package baseball;

import baseball.view.InputView;
import baseball.view.ResultView;
import java.util.List;
import java.util.Scanner;

public class Baseball {

    private final InputView inputView;
    private final ResultView resultView;
    private final Referee referee;

    public Baseball(InputView inputView, ResultView resultView, Referee referee) {
        this.inputView = inputView;
        this.resultView = resultView;
        this.referee = referee;
    }

    public void playGames() {
        do {
            Balls com = RandomBallGenerator.generateRandomBalls();

            playGame(com);

            resultView.printEnd();
            resultView.printRestartQuery();
        } while (inputView.inputToRestartQuery(new Scanner(System.in)));
    }

    private void playGame(Balls com) {
        resultView.printQuery();
        List<Integer> numbers = inputView.inputNumbers(new Scanner(System.in));

        Balls player = Balls.createBalls(numbers);

        GameResult gameResult = referee.play(com, player);

        resultView.printGameResult(gameResult);

        if (!gameResult.isGameEnd()) {
            playGame(com);
        }
    }

    public static void main(String[] args) {
        new Baseball(new InputView(), new ResultView(), new Referee()).playGames();
    }
}
