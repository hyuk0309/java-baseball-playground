package stringcalculator;

import stringcalculator.collection.OperandList;
import stringcalculator.collection.OperatorList;

public class BinaryCalculator {

    public Integer calculate(OperandList operandList, OperatorList operatorList) {
        Integer a;
        Integer b;
        String op;
        while (!operatorList.isEmpty()) {
            op = operatorList.getOperator();

            a = operandList.getFirstOperand();
            b = operandList.getFirstOperand();

            operandList.addToFirstOperand(binaryOperate(a, b, op));
        }

        Integer result = operandList.getFirstOperand();
        return result;
    }

    private Integer binaryOperate(Integer a, Integer b, String op) {
        if (op.equals("+")) {
            return a + b;
        }
        if (op.equals("-")) {
            return a - b;
        }
        if (op.equals("*")) {
            return a * b;
        }
        return a / b;
    }

}
