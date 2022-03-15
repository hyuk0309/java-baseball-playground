package numberbaseballgame.View;

import java.util.Scanner;

public class InputView {

    private Scanner scanner;

    public String input() {
        System.out.println("숫자를 입력해 주세요 : ");

        scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    public boolean restart() {
        scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input == 1) {
            return true;
        }
        return false;
    }

}
