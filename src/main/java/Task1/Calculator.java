package Task1;

import java.util.*;

public class Calculator {

    private final String[] OPERATORS = {"+", "-", "/", "*"};

    private Stack<String> stackOperations = new Stack<>();
    private Stack<String> stackRPN = new Stack<>();

    Calculator() {
        stackOperations.clear();
        stackRPN.clear();
    }


    public void calculate() {

        char[] input = new Scanner(System.in).nextLine().toCharArray();
        List<String> inputList = new ArrayList<>();

        for (char x : input) {
            inputList.add(String.valueOf(x));
        }

        convertToRPN(inputList.listIterator());
        Collections.reverse(stackRPN);
        SubExpression expression = new Expression();
        while (!stackRPN.empty()) {
            String token = stackRPN.pop();
            if (isNumber(token)) {
                expression.add(new Value(Double.parseDouble(token)));
            } else if (isOperator(token)) {
                expression.operation(token);
            }
        }
        try {
            System.out.println(expression.getValue());
        } catch (Exception e) {
            System.err.println("Unexpected item!");
        }
    }

    private void convertToRPN(ListIterator<String> tokens) {
        while (tokens.hasNext()) {
            String token = tokens.next();
            if (isNumber(token)) {
                stackRPN.push(token);
            } else if (isOperator(token)) {
                while (!stackOperations.empty() && isOperator(stackOperations.lastElement())
                        && (definePriority(token) <= definePriority(stackOperations.lastElement()))) {
                    stackRPN.push(stackOperations.pop());
                }
                stackOperations.push(token);
            } else if (isLeftBracket(token)) {
                stackOperations.push(token);
            } else if (isRightBracket(token)) {
                while (!stackOperations.empty() && !isLeftBracket(stackOperations.lastElement())) {
                    stackRPN.push(stackOperations.pop());
                }
                stackOperations.pop();
            } else {
                /*System.out.println("Unexpected item!");*/
                stackOperations.clear();
                stackRPN.clear();
                return;
            }
        }
        while (!stackOperations.empty()) {
            stackRPN.push(stackOperations.pop());
        }
        System.out.println("We've got an expression:\n" + stackRPN);
    }

    private boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private boolean isOperator(String token) {
        for (String op : OPERATORS)
            if (op.equals(token))
                return true;
        return false;
    }

    private boolean isLeftBracket(String token) {
        return token.equals("(");
    }

    private boolean isRightBracket(String token) {
        return token.equals(")");
    }

    private int definePriority(String operation) {
        if (operation.equals("+") || operation.equals("-"))
            return 1;
        else
            return 2;
    }
}
