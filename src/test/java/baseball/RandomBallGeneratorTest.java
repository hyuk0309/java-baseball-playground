package baseball;

import static org.assertj.core.api.Assertions.*;

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

}
