package Task1;

import java.util.Stack;

public class Expression implements SubExpression {

    private Stack<SubExpression> stackCalc;

    public Expression() {
        stackCalc = new Stack<>();
    }

    @Override
    public Double getValue() {
        return stackCalc.pop().getValue();
    }

    @Override
    public void add(SubExpression expr) {
        stackCalc.push(expr);
    }

    @Override
    public void operation(String token) {
        double operand1 = stackCalc.pop().getValue();
        double operand2 = stackCalc.pop().getValue();

        switch (token) {
            case "+":
                stackCalc.push(new Value(operand2 + operand1));
                break;
            case "-":
                stackCalc.push(new Value(operand2 - operand1));
                break;
            case "*":
                stackCalc.push(new Value(operand2 * operand1));
                break;
            case "/":
                stackCalc.push(new Value(operand2 / operand1));
                break;
        }
    }
}
