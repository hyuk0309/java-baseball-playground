package baseball.view;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {

    public List<Integer> inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        String numbersString = scanner.nextLine();

        validateRegex(numbersString);
        validateDuplicate(numbersString);

        return translateInput(numbersString);
    }

    private List<Integer> translateInput(String numbersString) {
        return numbersString.chars()
            .mapToObj(c -> Character.getNumericValue(c))
            .collect(Collectors.toList());
    }

    private void validateRegex(String numbersString) {
        if (!numbersString.matches("[1-9]{3}")) {
            throw new IllegalStateException("1-9사이의 숫자 3개를 입력해주세요.");
        }
    }

    private void validateDuplicate(String numbersString) {
        int numberCount = numbersString.chars()
            .boxed()
            .collect(Collectors.toSet())
            .size();
        if (numberCount != 3) {
            throw new IllegalStateException("숫자에 중복이 없게 입력해주세요.");
        }
    }

    public boolean inputToRestartQuery() {
        Scanner scanner = new Scanner(System.in);
        int restart = scanner.nextInt();

        if (restart == 1) {
            return true;
        }
        if (restart == 2) {
            return false;
        }
        throw new IllegalStateException("1 또는 2를 입력해주세요.");
    }

}
