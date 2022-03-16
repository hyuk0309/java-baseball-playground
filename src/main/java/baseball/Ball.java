package baseball;

import java.util.Objects;

public class Ball {

    private Integer no;

    public Ball(Integer no) {
        this.no = no;
    }

    public int myNo() {
        return no;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ball ball = (Ball) o;
        return no.equals(ball.no);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no);
    }
}
