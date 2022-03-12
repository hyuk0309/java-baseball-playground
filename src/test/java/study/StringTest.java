package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        //given
        //when
        String[] actual = "1,2".split(",");

        //then
        assertThat(actual).contains("1", "2");
    }

    @Test
    void noSplit() {
        //given
        //when
        String[] actual = "1".split(",");

        //then
        assertThat(actual).containsExactly("1");
    }

    @Test
    void substring() {
        //given
        //when
        String actual = "(1,2)".substring(1, 4);

        //then
        assertThat(actual).isEqualTo("1,2");
    }

}
