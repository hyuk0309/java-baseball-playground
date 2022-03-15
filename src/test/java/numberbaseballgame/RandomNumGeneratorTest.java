package numberbaseballgame;

import static org.assertj.core.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RandomNumGeneratorTest {

    RandomNumGenerator randomNumGenerator = new RandomNumGenerator();

    @DisplayName("난수 생성 중복 테스트")
    @Test
    void testGenerateRandomNum() {
        //given
        //when
        String randomNum = randomNumGenerator.generateRandomNum();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < randomNum.length(); ++i) {
            set.add(Character.getNumericValue(randomNum.charAt(i)));
        }

        //then
        assertThat(set.size()).isEqualTo(3);
    }

    @DisplayName("난수 범위 테스트")
    @Test
    void testRandomNumRange() {
        //given
        //when
        String randomNum = randomNumGenerator.generateRandomNum();

        //then
        assertThat(randomNum.length()).isEqualTo(3);
        assertThat(randomNum).doesNotContain("0");
    }

}