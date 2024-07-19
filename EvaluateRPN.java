import java.util.Stack;

public class EvaluateRPN {
    public double evalRPN(String [] exp)
    {
        double returnValue = 0;
        String operators = "*,+,-,/";
        int firstInt =0;
        int secondInt=0;

        Stack<String> stack = new Stack<String>();

        for(String s: exp)
        {
            if(!operators.contains(s))
            {
                stack.push(s);
            }
            else
            {
                firstInt = Integer.parseInt(stack.pop());
                secondInt = Integer.parseInt(stack.pop());
            }

            switch (s)
            {
                case "*":
                    stack.push(String.valueOf(firstInt * secondInt));
                    break;

                case "+":
                    stack.push(String.valueOf(firstInt + secondInt));
                    break;

                case "-":
                    stack.push(String.valueOf(firstInt - secondInt));
                    break;

                case "/":
                    stack.push(String.valueOf(firstInt / secondInt));
                    break;

            }
        }
        returnValue = Integer.valueOf(stack.pop());

        return returnValue;
    }

}
