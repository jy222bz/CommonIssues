package lnu.se.strategy;

/**
 * This class implements the interface Sorter.
 */
public class SortDescending implements Sorter {

    /**
     * It sorts the data in a descending order and returns it.
     *
     * @param data the data to be sorted.
     * @return sorted int [].
     */
    @Override
    public int[] sort(int[] data) {
        int length = data.length;
        for (int i = 1; i < length; ++i) {
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] < key) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }
        return data;
    }
}
