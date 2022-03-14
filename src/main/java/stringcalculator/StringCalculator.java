package stringcalculator;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class StringCalculator {

	private final Set<String> op = new HashSet<>();
	private final Deque<Integer> operands = new LinkedList<>();
	private final Queue<String> operators = new LinkedList<>();

	public StringCalculator() {
		op.add("+");
		op.add("-");
		op.add("*");
		op.add("/");
	}

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
			separator(value);
		}
	}

	private void separator(String value) {
		if(op.contains(value)) {
			operators.add(value);
			return;
		}

		operands.addLast(Integer.parseInt(value));
	}

	private Integer calculate() {
		Integer a;
		Integer b;
		Integer result;
		String op;
		while(!operators.isEmpty()) {
			op = operators.poll();

			a = operands.pollFirst();
			b = operands.pollFirst();

			operands.addFirst(binaryOperate(a, b, op));
		}

		return operands.pollFirst();
	}

	private Integer binaryOperate(Integer a, Integer b, String op) {
		if(op.equals("+")) {
			return a + b;
		}
		if(op.equals("-")) {
			return a - b;
		}
		if(op.equals("*")) {
			return a * b;
		}
		return a / b;
	}

}
