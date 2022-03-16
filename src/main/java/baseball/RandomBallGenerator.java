package baseball;

import java.util.HashSet;
import java.util.Set;

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

    public static Balls generateRandomBalls() {
        Set<Ball> balls = new HashSet<>();
        while (balls.size() < 3) {
            balls.add(generateRandomBall());
        }
        return new Balls(balls);
    }
}
