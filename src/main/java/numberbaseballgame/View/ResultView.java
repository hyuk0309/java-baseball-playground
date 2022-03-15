package numberbaseballgame.View;

import numberbaseballgame.GameResult;

public class ResultView {

    public void output(GameResult gameResult) {
        if(gameResult.getStrike() == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return;
        }
        if(gameResult.getBall() == 0 && gameResult.getStrike() == 0) {
            System.out.println("낫싱");
            return;
        }

        String msg = "";
        if(gameResult.getBall() > 0) {
            msg += gameResult.getBall() + "볼 ";
        }
        if(gameResult.getStrike() > 0) {
            msg += gameResult.getStrike() + "스트라이크";
        }
        System.out.println(msg);
    }

    public void askRestart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

}
