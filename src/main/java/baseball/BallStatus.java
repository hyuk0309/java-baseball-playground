package baseball;

public enum BallStatus {
    STRIKE, BALL, NOTHING;

    public boolean isStrike(BallStatus result) {
        if (result == STRIKE) {
            return true;
        }
        return false;
    }

    public boolean isBall(BallStatus result) {
        if (result == BALL) {
            return true;
        }
        return false;
    }
}
