package baseball;

import static org.assertj.core.api.Assertions.*;


import java.util.LinkedHashSet;
import java.util.Set;
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

}