package baseball;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomBallGeneratorTest {

    @DisplayName("1 ~ 9 사이의 난수 하나 생성")
    @Test
    void generateRandomNo() {
        //given
        //when
        int no = RandomBallGenerator.generateRandomNo();

        //then
        assertThat(no)
            .isGreaterThanOrEqualTo(1)
            .isLessThanOrEqualTo(9);
    }

    @DisplayName("랜덤 볼 생성")
    @Test
    void generateRandomBall() {
        //given
        //when
        Ball ball = RandomBallGenerator.generateRandomBall();

        //then
        assertThat(ball.myNo())
            .isGreaterThanOrEqualTo(1)
            .isLessThanOrEqualTo(9);
    }

    @DisplayName("볼 중복 확인")
    @Test
    void duplicate() {
        //given
        List<Ball> balls = Arrays.asList(new Ball(1), new Ball(2));
        Ball ball = new Ball(1);

        //when
        boolean actual = RandomBallGenerator.validateDuplicate(balls, ball);

        //then
        assertThat(actual).isFalse();
    }

    @DisplayName("볼 중복 확인 2")
    @Test
    void noDuplicate() {
        //given
        List<Ball> balls = Arrays.asList(new Ball(1), new Ball(2));
        Ball ball = new Ball(3);

        //when
        boolean actual = RandomBallGenerator.validateDuplicate(balls, ball);

        //then
        assertThat(actual).isTrue();
    }

}
