package stringcalculator.collection;

import java.util.Deque;

public class OperandList {

	private final Deque<Integer> operandList;

	public OperandList(Deque<Integer> operandList) {
		this.operandList = operandList;
	}

	public Integer getFirstOperand() {
		if(operandList.size() == 0) {
			throw new IllegalStateException("operand가 없습니다.");
		}
		return operandList.pollFirst();
	}

	public void addToFirstOperand(Integer num) {
		operandList.addFirst(num);
	}
}
