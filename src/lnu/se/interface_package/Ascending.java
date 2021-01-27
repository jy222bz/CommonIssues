package lnu.se.interface_package;

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
