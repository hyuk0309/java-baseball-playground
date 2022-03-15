package numberbaseballgame;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import numberbaseballgame.model.GameResult;

public class Compare {

    public GameResult compareNum(String randomNum, String userInput) {

        int strike = countStrike(randomNum, userInput);
        int ball = countBall(randomNum, userInput);

        return new GameResult(strike, ball);
    }

    private int countBall(String randomNums, String userNums) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < randomNums.length(); ++i) {
            set.add(randomNums.charAt(i));
        }

        return (int) IntStream.range(0, 3)
            .filter(idx ->
                (set.contains(userNums.charAt(idx)) && (userNums.charAt(idx) != randomNums.charAt(
                    idx))))
            .count();
    }

    private int countStrike(String randomNums, String userNums) {
        return (int) IntStream.range(0, 3)
            .filter(idx -> randomNums.charAt(idx) == userNums.charAt(idx))
            .count();
    }
}
