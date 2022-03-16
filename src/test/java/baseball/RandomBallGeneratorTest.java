package baseball;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomBallGeneratorTest {

    RandomBallGenerator randomBallGenerator = new RandomBallGenerator();

    @DisplayName("1 ~ 9 사이의 난수 하나 생성")
    @Test
    void generateRandomBall() {
        //given
        //when
        int ball = randomBallGenerator.generateRandomBall();

        //then
        assertThat(ball)
            .isGreaterThanOrEqualTo(1)
            .isLessThanOrEqualTo(9);
    }

    @DisplayName("난수 중복 체크")
    @Test
    void duplicate() {
        //given
        int ball = 1;
        List<Integer> balls = Arrays.asList(1, 2);

        //when
        boolean actual = randomBallGenerator.validateDuplicate(balls, ball);

        //then
        assertThat(actual).isFalse();
    }

    @DisplayName("난수 중복 체크 2")
    @Test
    void noDuplicate() {
        //given
        int ball = 3;
        List<Integer> balls = Arrays.asList(1, 2);

        //when
        boolean actual = randomBallGenerator.validateDuplicate(balls, ball);

        //then
        assertThat(actual).isTrue();
    }

}
