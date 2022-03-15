package numberbaseballgame.view;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class InputView {

    private Scanner scanner;

    public String inputNumber() {
        scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        validateSize(input);
        validateDuplicate(input);
        validateRange(input);

        return input;
    }

    private void validateRange(String input) {
        if (input.contains("0")) {
            throw new IllegalStateException("난수에 0이 포함되었습니다.");
        }
    }

    private void validateDuplicate(String input) {
        Set<Character> set = input.chars()
            .mapToObj(num -> (char) num)
            .collect(Collectors.toSet());

        if (set.size() != 3) {
            throw new IllegalStateException("난수에 중복이 있습니다.");
        }
    }

    private void validateSize(String input) {
        if (input.length() != 3) {
            throw new IllegalStateException("숫자의 길이가 3이 아닙니다.");
        }
    }

    public boolean restart() {
        scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == 1) {
            return true;
        }
        return false;
    }

}
