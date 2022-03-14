package study;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class StringTest {

    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @DisplayName("split 테스트")
    @Test
    void split() {
        //given
        //when
        String[] actual = "1,2".split(",");

        //then
        assertThat(actual).contains("1", "2");
    }

    @DisplayName("split 일어나지 않는 경우 테스트")
    @Test
    void noSplit() {
        //given
        //when
        String[] actual = "1".split(",");

        //then
        assertThat(actual).containsExactly("1");
    }

    @DisplayName("substring() 테스트")
    @Test
    void substring() {
        //given
        //when
        String actual = "(1,2)".substring(1, 4);

        //then
        assertThat(actual).isEqualTo("1,2");
    }

    @DisplayName("charAt 정상동작 테스트")
    @RepeatedTest(value = 3, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    void charAt() {
        //given
        int randomIdx = (int) (Math.random() * 10) % 3;
        char[] charArr = "abc".toCharArray();

        //when
        char actual = "abc".charAt(randomIdx);

        //then
        assertThat(actual).isEqualTo(charArr[randomIdx]);
    }

    @DisplayName("charAt outOfBound test")
    @Test
    void chatAtOutOfBound() {
        //given
        int index = "abc".length();

        //when
        //then
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
            .isThrownBy(() -> "abc".charAt(index));
    }

}
