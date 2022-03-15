package numberbaseballgame;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CompareTest {

    @DisplayName("숫자비교 테스트")
    @ParameterizedTest
    @CsvSource(value = {"123,1,0", "456,1,1", "789,0,0"})
    void testCompare(String userInput, int strike, int ball) {
        //given
        String randomNum = "425";

        //when
        GameResult gameResult = new Compare().compareNum(randomNum, userInput);

        //then
        assertThat(gameResult.getStrike()).isEqualTo(strike);
        assertThat(gameResult.getBall()).isEqualTo(ball);
    }
}