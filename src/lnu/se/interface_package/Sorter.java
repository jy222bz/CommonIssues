package lnu.se.interface_package;

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
