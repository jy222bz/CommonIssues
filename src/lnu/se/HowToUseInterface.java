package lnu.se;

import java.util.Arrays;

interface Sorter {

    /**
     * It returns an array that ordered either in ascending order or descending order.
     * It depends on the implementation.
     *
     * @param number1 some number
     * @param number2 some number
     * @return ordered array.
     */
    int[] getOrderedArray(int number1, int number2);
}

class Ascending implements Sorter {

    /**
     * It returns an array that ordered in ascending order.
     *
     * @param number1 some number
     * @param number2 some number
     * @return ordered array.
     */
    @Override
    public int[] getOrderedArray(int number1, int number2) {
        if (number1 > number2) {
            return new int[]{number2, number1};
        } else {
            return new int[]{number1, number2};
        }
    }
}

class Descending implements Sorter {

    /**
     * It returns an array that ordered in descending order.
     *
     * @param number1 some number
     * @param number2 some number
     * @return ordered array.
     */
    @Override
    public int[] getOrderedArray(int number1, int number2) {
        if (number1 < number2) {
            return new int[]{number2, number1};
        } else {
            return new int[]{number1, number2};
        }
    }
}

public class HowToUseInterface {

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
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}

