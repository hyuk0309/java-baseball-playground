package baseball.view;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class InputViewTest {

    InputView inputview = new InputView();

    @DisplayName("사용자 난수 입력 받기 - 정상")
    @Test
    void normal() {
        //given
        Scanner scanner = new Scanner(generateUserInputStream("123"));

        //when
        List<Integer> actual = inputview.inputNumbers(scanner);

        //then
        Assertions.assertThat(actual).isNotNull();
    }

    @DisplayName("사용자 난수 입력 받기 - 정규식만족 x")
    @ParameterizedTest
    @ValueSource(strings = {"012", "abc", "1234"})
    void exceptRegex(String input) {
        //given
        Scanner scanner = new Scanner(generateUserInputStream(input));

        //when
        //then
        assertThrows(IllegalStateException.class,
            () -> inputview.inputNumbers(scanner));
    }

    @DisplayName("사용자 난수 입력 받기 - 중복")
    @Test
    void duplicate() {
        //given
        Scanner scanner = new Scanner(generateUserInputStream("122"));

        //when
        //then
        assertThrows(IllegalStateException.class,
            () -> inputview.inputNumbers(scanner));
    }

    @DisplayName("사용자 게임 재시작 입력 - 정상")
    @ParameterizedTest
    @CsvSource(value = {"1,true", "2,false"})
    void normalRestartInput(String input, boolean expected) {
        //given
        Scanner scanner = new Scanner(generateUserInputStream(input));

        //when
        boolean actual = inputview.inputToRestartQuery(scanner);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @DisplayName("사용자 게임 재시작 입력 - 예외")
    @ParameterizedTest
    @ValueSource(strings = {"0", "3"})
    void exceptRestartInput(String input) {
        //given
        Scanner scanner = new Scanner(generateUserInputStream(input));

        //when
        //then
        assertThrows(IllegalStateException.class,
            () -> inputview.inputToRestartQuery(scanner));
    }

    private static InputStream generateUserInputStream(String input) {
        return new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
    }
}