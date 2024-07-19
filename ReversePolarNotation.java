/*
Normal Notation (Infix)
In normal notation, also known as infix notation, the operators are placed between the operands.
 This is the most common way of writing mathematical expressions.

Example: 3 + 4 * 2 / (1 - 5) ^ 2 ^ 3

Reverse Polish Notation (RPN)
In reverse Polish notation, also known as postfix notation, the operators follow their operands.
This notation does not require parentheses to dictate operation order,
as the position of the operator relative to its operands makes the order explicit.

Example: 3 4 2 * 1 5 - 2 3 ^ ^ / +

Polish Notation (Prefix)
In Polish notation, also known as prefix notation, the operators precede their operands.
Like RPN, this notation eliminates the need for parentheses by making
the order of operations explicit through the position of the operator.
*
* */
public class ReversePolarNotation {
    public static void main(String[] args) {
        EvaluateRPN obj = new EvaluateRPN();
        String [] expression = {"2","3","*","9","1","+","+"};
        double finalCalculationValue = 0;

        finalCalculationValue = obj.evalRPN(expression);
        System.out.println(finalCalculationValue);
    }
}