package baseball.view;

import java.util.List;

import baseball.domain.GameResult;

public class OutputView {
	private static final String BALL_MESSAGE = "볼 ";
	private static final String STRIKE_MESSAGE = "스트라이크";
	private static final String NOTHING_MESSAGE = "낫싱";
	private static final String GAME_CLEAR_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
	private final GameResult result;

	public OutputView(GameResult result) {
		this.result = result;
	}

	private void printGameResult() {
		printAllBall();
		printAllStrike();
		printNothing();
		printBallAndStrike();
	}

	public static void printClearMessage() {
		System.out.println(GAME_CLEAR_MESSAGE);
	}

	private void printAllBall () {
		if (result.ballCount != 0 && result.strikeCount == 0) {
			System.out.println(result.ballCount + BALL_MESSAGE);
		}
	}

	private void printAllStrike() {
		if (result.ballCount == 0 && result.strikeCount != 0) {
			System.out.println(result.strikeCount + STRIKE_MESSAGE);
		}
	}
	private void  printBallAndStrike() {
		if (result.ballCount != 0 && result.strikeCount != 0) {
			System.out.println(result.ballCount + BALL_MESSAGE + result.strikeCount + STRIKE_MESSAGE);
		}
	}
	private void printNothing() {
		if (result.ballCount == 0 && result.strikeCount == 0) {
			System.out.println(NOTHING_MESSAGE);
		}
	}


}
