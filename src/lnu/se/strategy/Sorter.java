package lnu.se.strategy;

/**
 * This interface provides one method.
 * The implementing class can implement it in either descending or ascending order.
 */
public interface Sorter {

    /** It sorts te data and returns it.
     * @param data the data to be sorted.
     * @return sorted int [].
     */
    int[] sort(int[] data);
}
