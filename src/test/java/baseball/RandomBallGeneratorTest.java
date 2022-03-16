package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomBallGeneratorTest {

    @Test
    void generateRandomBall() {
        //given
        //when
        RandomBallGenerator randomBallGenerator = new RandomBallGenerator();
        int ball = randomBallGenerator.generateRandomBall();

        //then
        Assertions.assertThat(ball)
            .isGreaterThanOrEqualTo(1)
            .isLessThanOrEqualTo(9);
    }
}
