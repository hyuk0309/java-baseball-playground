package stringcalculator;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

import stringcalculator.collection.OperandList;
import stringcalculator.collection.OperatorList;

public class StringCalculator {

	private final Set<String> operator;
	private final BinaryCalculator binaryCalculator;

	public StringCalculator() {
		binaryCalculator = new BinaryCalculator();
		operator = new HashSet<>();
		operator.add("+");
		operator.add("-");
		operator.add("*");
		operator.add("/");
	}

	public Integer calculateString(String input) {
		Deque<Integer> operands = new LinkedList<>();
		Queue<String> operators = new LinkedList<>();
		input(input, operands, operators);

		OperatorList operatorList = new OperatorList(operators);
		OperandList operandList = new OperandList(operands);
		return binaryCalculator.calculate(operandList, operatorList);
	}

	private void input(String input, Deque<Integer> operands, Queue<String> operators) {
		if(input == null) {
			Scanner scanner = new Scanner(System.in);
			input = scanner.nextLine();
		}

		String[] values = input.split(" ");
		for (String value : values) {
			separator(value, operands, operators);
		}
	}

	private void separator(String value, Deque<Integer> operands, Queue<String> operators) {
		if(operator.contains(value)) {
			operators.add(value);
			return;
		}
		operands.addLast(Integer.parseInt(value));
	}

}
