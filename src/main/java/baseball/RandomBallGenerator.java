package baseball;

public class RandomBallGenerator {

    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 9;

    public int generateRandomBall() {
        int randomBall;
        do {
            randomBall = (int)(Math.random() * 10) % 10;
        } while(!validateRange(randomBall));
        return randomBall;
    }

    private boolean validateRange(int randomBall) {
        return MIN_RANGE <= randomBall && randomBall <= MAX_RANGE;
    }
}
