package baseball;

import static baseball.BallStatus.*;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GameResultTest {

    @DisplayName("게임 종료여부 테스트 - 종료")
    @Test
    void gameEnd() {
        //given
        GameResult gameResult = makeGameResult(STRIKE, STRIKE, STRIKE);

        //when
        boolean result = gameResult.isGameEnd();

        //then
        assertThat(result).isTrue();
    }

    @DisplayName("게임 종료여부 테스트 - 종료x")
    @Test
    void gameNotEnd() {
        //given
        GameResult gameResult = makeGameResult(STRIKE, BALL);

        //when
        boolean result = gameResult.isGameEnd();

        //then
        assertThat(result).isFalse();
    }

    private GameResult makeGameResult(BallStatus... statuses) {
        GameResult gameResult = new GameResult();
        for (BallStatus status : statuses) {
            gameResult.report(status);
        }
        return gameResult;
    }
}