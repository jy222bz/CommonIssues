package lnu.se;

import java.util.ArrayList;

/**
 * @author Jacob Yousif
 * @since 2020-10-17
 * <p>
 * It is good practice to document your code with java docs styles.
 * It gives a positive impression about your code.
 * <p>
 * Do not use in-line comments.
 */
public class Main {

    /**
     * It is good to name booleans as questions "is" in front of a verb.
     * It makes it a questions and intuitive, in this way the reader can understand the
     * assignment of this boolean directly. This applies to boolean variables and methods that return
     * boolean values.
     */
    private boolean isDebugging = false;

    /**
     * Use descriptive names for variables.
     */
    private int loopCounter;

    /**
     * This is not a good name. It is not obvious what x means!
     */
    private int x;

    /**
     * This is the main entry point.
     *
     * @param args arguments.
     */
    public static void main(String[] args) {

        ArrayList emptyList = new ArrayList();


        if (emptyList.size() == 0) {
            System.out.println("This is not a good practise for checking whether the list" +
                    "is empty.");
        }

        if (emptyList.isEmpty()) {
            System.out.println("This is a good practise for checking whether the list" +
                    "is empty. This style is more intuitive than the above!");
        }
    }

    /**
     * Always use a verb for method, the verb should
     * describe the functionality of the method.
     *
     * @param operand1 the first operand.
     * @param operand2 the second operand.
     * @return result.
     */
    private int divide(int operand1, int operand2) {
        if (isZero(operand2)) {
            throw new ArithmeticException("You cannot divide by zero!");
        }
        return operand1 / operand2;
    }

    /**
     * It is good to have boolean methods as questions.
     * Just like this one, it will become intuitive.
     *
     * @param target the value to be checked.
     * @return boolean.
     */
    private boolean isZero(int target) {
        return target == 0;
    }
}
