package lnu.se.interface_package;

import java.util.Arrays;

public class Main {

    /**
     * It uses the Ascending class and the descending class to sort the two numbers
     * based on the condition.
     *
     * @param number1     some number
     * @param number2     some number
     * @param isAscending whether it is ascending or otherwise.
     * @return an ordered array based on the condition.
     */
    private static int[] getOrderedArray(int number1, int number2, boolean isAscending) {
        /* Since both the Ascending class and the descending class implement the
         * Sorter interface. We can declare the Math interface and dynamically assign it
         * to any of these classes.
         * We can directly create the class and return the ordered array but
         * I want to emphasize the use of Interface in a dynamic way.
         * Do not use in-line comment like this one. I used it now just to explain.*/
        Sorter sorter;
        if (isAscending) {
            //return new Ascending().getOrderedArray(number1, number2)
            sorter = new Ascending();
        } else {
            //return new Descending().getOrderedArray(number1, number2)
            sorter = new Descending();
        }
        return sorter.getOrderedArray(number1, number2);
    }

    public static void main(String[] args) {

        int[] twoNumbersInAscendingOrder = getOrderedArray(5, 20, true);
        for (int i : twoNumbersInAscendingOrder) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------------------");
        int[] twoNumbersInDescendingOrder = getOrderedArray(7, 30, false);
        Arrays.stream(twoNumbersInDescendingOrder).forEach(System.out::println);

        /* This is a functional interface since it has one method.
         * we can implement it with the lambda expression and make it anonymous function.
         * If the statement true then the method returns the first array that comes
         * after the question mark. Otherwise, it is false then it will return the second array.
         * Do not use in-line comment like this one. I used it now just to explain the expression.*/
        Sorter sorter = (number1, number2) ->
                number1 < number2 ? new int[]{number2, number1} : new int[]{number1, number2};


        System.out.println("-------------------------------------------------");
        int[] data = sorter.getOrderedArray(10, 90);
        for (int datum : data) {
            System.out.println(datum);
        }
    }
}

