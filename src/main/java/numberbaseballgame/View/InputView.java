package numberbaseballgame.View;

import java.util.Scanner;

public class InputView {

    private Scanner scanner;

    public String inputNumber() {
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
