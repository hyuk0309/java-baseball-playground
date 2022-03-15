package numberbaseballgame;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BaseballGameTest {

    @DisplayName("숫자비교 테스트")
    @Test
    void testCompare() {
        //given
        String randomNum = "425";
        String userInput = "789";

        //when
        GameResult gameResult = new BaseballGame().compareNum(randomNum, userInput);

        //then
        assertThat(gameResult.getStrike()).isEqualTo(0);
        assertThat(gameResult.getBall()).isEqualTo(0);
    }

}