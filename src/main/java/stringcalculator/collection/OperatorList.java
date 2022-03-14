package stringcalculator.collection;

import java.util.Queue;

public class OperatorList {

    private final Queue<String> operatorList;

    public OperatorList(Queue<String> operatorList) {
        this.operatorList = operatorList;
    }

    public String getOperator() {
        if (operatorList.size() == 0) {
            throw new IllegalStateException("연산자가 없습니다.");
        }
        return operatorList.poll();
    }

    public boolean isEmpty() {
        return operatorList.isEmpty();
    }
}
