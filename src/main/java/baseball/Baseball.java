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

    public void play() {
        while(true) {
            Balls com = RandomBallGenerator.generateRandomBalls();

            resultView.printQuery();
            List<Integer> numbers = inputView.inputNumbers(new Scanner(System.in));
            //Balls player = new Balls(numbers);

        }
    }
}
