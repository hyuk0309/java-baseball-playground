package stringcalculator;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StringCalculator {

	private final String[] operator = {"+", "-", "*", "/"};
	private final Deque<Integer> operands = new LinkedList<>();
	private final Queue<String> operators = new LinkedList<>();

	public Integer calculateString(String input) {
		input(input);
		return calculate();
	}

	private void input(String input) {
		if(input == null) {
			Scanner scanner = new Scanner(System.in);
			input = scanner.nextLine();
		}

		String[] values = input.split(" ");
		for (String value : values) {
			if(isOperation(value)) {
				operators.add(value);
			} else {
				operands.addLast(Integer.parseInt(value));
			}
		}
	}

	private boolean isOperation(String value) {
		for(String op : operator) {
			if(value.equals(op)) {
				return true;
			}
		}
		return false;
	}

	private Integer calculate() {
		Integer a;
		Integer b;
		String op;
		while(!operators.isEmpty()) {
			op = operators.poll();

			a = operands.pollFirst();
			b = operands.pollFirst();

			if(op.equals("+")) {
				operands.addFirst(add(a, b));
			} else if(op.equals("-")) {
				operands.addFirst(subtract(a, b));
			} else if(op.equals("*")) {
				operands.addFirst(multiply(a, b));
			} else {
				operands.addFirst(divide(a, b));
			}
		}

		return operands.pollFirst();
	}

	private Integer add(int i, int j) {
		return i + j;
	}

	private Integer subtract(int i, int j) {
		return i - j;
	}

	private Integer multiply(int i, int j) {
		return i * j;
	}

	private Integer divide(int i, int j) {
		return i / j;
	}
}
