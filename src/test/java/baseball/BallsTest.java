package baseball;

import static org.assertj.core.api.Assertions.*;


import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BallsTest {

    Balls balls;

    @BeforeEach
    void init() {
        Set<Ball> set = new LinkedHashSet<>();
        set.add(new Ball(4));
        set.add(new Ball(2));
        set.add(new Ball(5));

        balls = new Balls(set);
    }

    @DisplayName("컴퓨터 야구공 3개와 사용자 야구공 1개 비교 - 낫씽")
    @Test
    void nothing() {
        //given
        //when
        BallStatus result = balls.play(0, new Ball(1));

        //then
        assertThat(result).isEqualTo(BallStatus.NOTHING);
    }

    @DisplayName("컴퓨터 야구공 3개와 사용자 야구공 1개 비교 - 스트라이크")
    @Test
    void strike() {
        //given
        //when
        BallStatus result = balls.play(0, new Ball(4));

        //then
        assertThat(result).isEqualTo(BallStatus.STRIKE);
    }

    @DisplayName("컴퓨터 야구공 3개와 사용자 야구공 1개 비교 - 볼")
    @Test
    void ball() {
        //given
        //when
        BallStatus result = balls.play(0, new Ball(2));

        //then
        assertThat(result).isEqualTo(BallStatus.BALL);
    }

    @DisplayName("사용자의 입력 -> balls 객체로 변환")
    @Test
    void creatBallByUser() {
        //given
        List<Integer> numbers = Arrays.asList(1, 2, 3);

        //when
        Balls balls = Balls.createBalls(numbers);

        //then
        assertThat(balls.bringBall(0)).isEqualTo(new Ball(1));
        assertThat(balls.bringBall(1)).isEqualTo(new Ball(2));
        assertThat(balls.bringBall(2)).isEqualTo(new Ball(3));
    }

}