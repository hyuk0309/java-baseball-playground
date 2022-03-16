package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Balls {

    private final List<Ball> balls;

    public Balls(Set<Ball> balls) {
        this.balls = new ArrayList<>(balls);
    }

    public int count() {
        return balls.size();
    }

    public BallStatus play(int position, Ball ball) {
        if (balls.get(position).equals(ball)) {
            return BallStatus.STRIKE;
        }
        if (!balls.get(position).equals(ball) && balls.contains(ball)) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    public Ball bringBall(int position) {
        return balls.get(position);
    }
}
