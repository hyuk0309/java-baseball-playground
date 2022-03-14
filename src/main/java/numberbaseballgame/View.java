package numberbaseballgame;

import java.util.Scanner;

public class View {

    private Scanner scanner = new Scanner(System.in);

    public String input() {
        System.out.println("숫자를 입력해 주세요 : ");
        String input = scanner.nextLine();
        return input;
    }

}
