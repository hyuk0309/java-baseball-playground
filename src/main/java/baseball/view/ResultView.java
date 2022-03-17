package baseball.view;

import baseball.GameResult;

public class ResultView {

    public void printQuery() {
        System.out.print("숫자를 입력해 주세요 : ");
    }

    public void printGameResult(GameResult gameResult) {
        String resultMsg = "";
        if(gameResult.countBall() > 0) {
            resultMsg += String.valueOf(gameResult.countBall()) + "볼 ";
        }
        if(gameResult.countStrike() > 0) {
            resultMsg += String.valueOf(gameResult.countStrike()) + "스트라이크";
        }
        System.out.println(resultMsg);
    }

    public void printEnd() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public void printRestartQuery() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

}
