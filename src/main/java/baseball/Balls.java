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
}
