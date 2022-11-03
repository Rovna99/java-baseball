package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
	private final static String INPUT_NUMBER_MESSAGE = "숫자를 입력해주세요 : ";
	private final static String INPUT_RESTART_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

	public static String printInputNumberMessage() {
		System.out.print(INPUT_NUMBER_MESSAGE);
		return Console.readLine();
	}

	public static String printInputRestartMessage() {
		System.out.println(INPUT_NUMBER_MESSAGE);
		return Console.readLine();
	}
}
