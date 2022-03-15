package numberbaseballgame;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CompareTest {
    @DisplayName("숫자비교 테스트")
    @Test
    void testCompare() {
        //given
        String randomNum = "425";
        String userInput = "789";

        //when
        GameResult gameResult = new Compare().compareNum(randomNum, userInput);

        //then
        assertThat(gameResult.getStrike()).isEqualTo(0);
        assertThat(gameResult.getBall()).isEqualTo(0);
    }
}