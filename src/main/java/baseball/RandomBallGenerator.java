package baseball;

import java.util.ArrayList;
import java.util.List;

public class RandomBallGenerator {

    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 9;

    public static Ball generateRandomBall() {
        return new Ball(generateRandomNo());
    }

    public static int generateRandomNo() {
        int no;
        do {
            no = (int) (Math.random() * 10) % 10;
        } while (!validateRange(no));
        return no;
    }

    private static boolean validateRange(int no) {
        return MIN_RANGE <= no && no <= MAX_RANGE;
    }

    public static boolean validateDuplicate(List<Ball> balls, Ball ball) {
        return !balls.contains(ball);
    }
}
