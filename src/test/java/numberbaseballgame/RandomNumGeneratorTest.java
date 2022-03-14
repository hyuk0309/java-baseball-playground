package numberbaseballgame;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RandomNumGeneratorTest {

    RandomNumGenerator randomNumGenerator = new RandomNumGenerator();

    @DisplayName("난수 생성 클래스 중복 테스트")
    @Test
    void testGenerateRandomNum() {
        //given
        //when
        String randomNum = randomNumGenerator.generateRandomNum();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < randomNum.length(); ++i) {
            set.add(Character.getNumericValue(randomNum.charAt(i)));
        }

        //then
        assertThat(set.size()).isEqualTo(3);
    }

}