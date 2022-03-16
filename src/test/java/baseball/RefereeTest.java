package baseball;

import static org.assertj.core.api.Assertions.*;

import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RefereeTest {

    Referee referee = new Referee();

    @DisplayName("사용자의 공 3개와 컴퓨터의 공 3개 비교 - 낫씽")
    @Test
    void nothing() {
        //given
        Balls com = makeBalls(4, 2, 5);
        Balls player = makeBalls(7, 8, 9);

        //when
        GameResult gameResult = referee.play(com, player);

        //then
        assertThat(gameResult.countStrike()).isEqualTo(0);
        assertThat(gameResult.countBall()).isEqualTo(0);
    }

    @DisplayName("사용자의 공 3개와 컴퓨터의 공 3개 비교 - 1스트라이크")
    @Test
    void oneStrike() {
        //given
        Balls com = makeBalls(4, 2, 5);
        Balls player = makeBalls(1, 2, 3);

        //when
        GameResult gameResult = referee.play(com, player);

        //then
        assertThat(gameResult.countStrike()).isEqualTo(1);
        assertThat(gameResult.countBall()).isEqualTo(0);
    }

    @DisplayName("사용자의 공 3개와 컴퓨터의 공 3개 비교 - 1볼 1스트라이크")
    @Test
    void oneBallOneStrike() {
        //given
        Balls com = makeBalls(4, 2, 5);
        Balls player = makeBalls(4, 5, 6);

        //when
        GameResult gameResult = referee.play(com, player);

        //then
        assertThat(gameResult.countStrike()).isEqualTo(1);
        assertThat(gameResult.countBall()).isEqualTo(1);
    }

    private Balls makeBalls(int... nums) {
        Set<Ball> balls = new LinkedHashSet<>();
        for (int num : nums) {
            balls.add(new Ball(num));
        }
        return new Balls(balls);
    }

}
