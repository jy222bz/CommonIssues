package lnu.se;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Nesting {

    /**
     * We declared the array list.
     */
    private ArrayList list;

    /**
     * It initializes the list.
     */
    private void init() {
        list = new ArrayList();
    }

    /**
     * This is an example of nested if-statements.
     * It may be a simple and not reflective of more complex issues.
     * However, nested if-statements is an issue and it is
     * not a good practice for multiple reasons.
     * The code will be difficult to test.
     * A bug will be introduced easily in a such situation.
     * The code will not be intuitive and will be
     * difficult to understand and to follow its logic.
     *
     * @param index the index.
     * @return Object.
     */
    public Object getItem(int index) {
        if (list != null) {
            if (!list.isEmpty()) {
                if (list.get(index) != null) {
                    return list.get(index);
                }
            }
        }

        throw new IllegalArgumentException();
    }

    /**
     * This will cause a null exception.
     * Because we declared the list but
     * we did not initialize it
     * so there is no pointer that can point to
     * the location of the list in the memory.
     * Rather it will point to null.
     *
     * @return the size of the list.
     */
    public int size() {
        return list.size();
    }

    /**
     * This method checks whether the values in list1 has their corresponding square values
     * in list2. Assume list1 has (2,3) list2 should have the square values of list1 which are:
     * (4,9). The order is not important.
     * <p>
     * This method solves the problem by nested loops.
     * It may be tempting to use nested loops to solve the problem at hand with
     * nested loops but that is not good at all when it comes optimization and time efficiency.
     * Try to sole it in another way.
     * Nested loops are not appreciated and not optimized either.
     * Avoid them if you can.
     * <p>
     * Imagine that each list has 1000 elements, that implies
     * the outer for-loop will loop for 1000 times and the inner for-loop will loop
     * for 1000 times also. That will cause the amount of loops will
     * be 1000 * 1000 = 1000 000 loops.
     * NOTE: We are not considering the internal operations in the lists in terms of time efficiency, 
     * we are computing only the loops.
     * <p>
     * A better solution is to use frequency counters and multiple independent loops
     * to solve the problem.
     * Even if you use 12 independent for-loops that is way better than using nested loops.
     * 12 independent loops mean 12 * 1000 = 12 000 loops in total which is far
     * better than nested loops where they will be 1000 000 loops.
     * Time complexity; O(n^2)
     *
     * @param list1 the initial values.
     * @param list2 the square values.
     * @return whether list2 contain the square values of list1
     */
    public boolean isQuadratic(List<Integer> list1, List<Integer> list2) {
        if (list1.size() != list2.size() || list1.isEmpty()) {
            return false;
        }
        int counter = 0;
        for (Integer integer : list1) {
            for (int j = 0; j < list2.size(); j++) {
                if ((integer * integer) == list2.get(j)) {
                    list2.remove(j);
                    ++counter;
                    break;
                }
            }
        }

        return counter == list1.size();
    }

    /**
     * This method checks whether the values in list1 has their corresponding square values
     * in list2. Assume list1 has (2,3) list2 should have the square values of list1 which are:
     * (4,9). The order is not important.
     * <p>
     * This method solves the same problem above. The amount of code lines in the above
     * method are less than this method but this method is more optimized.
     * This method solves the problem in a different way;
     * in a more optimized way, where the whole operation
     * takes three independent loops. Assume the list size is 1000
     * then the amount of loops in the worst case is 3000 loops
     * where nested loops take 1000 * 1000 = 1000 000 loops.
     * Therefore, you should not depend on nested loops as much as you can.
     * Time complexity; O(3n) => O(n)
     * NOTE: We are not considering the internal operations in the lists and hashmaps in terms of time efficiency, 
     * we are computing only the loops.
     *
     * @param list1 the initial values.
     * @param list2 the square values.
     * @return whether list2 contain the square values of list1
     */
    public boolean isQuadratic2(List<Integer> list1, List<Integer> list2) {
        if (list1.size() != list2.size() || list1.isEmpty()) {
            return false;
        }
        boolean areSquareValuesCorrect = true;

        /* We call another linear method.
         * This is the first loop where we populate list1 in a hashmap
         * where the keys are the items from list1 and
         * the values are the frequencies of the items; how many times the items occur in list1*/
        HashMap<Integer, Integer> valuesAndFrequencies = getValuesAndFrequencies(list1);
        /* We call another linear method.
         * This is second first loops where we populate list2 in another hashmap
         * where the keys are the items from the list and
         * the values are the frequencies of the items; how many times the item occur in list2*/
        HashMap<Integer, Integer> squareValuesAndFrequencies = getValuesAndFrequencies(list2);

        /* This is the third and the final loop.
         * Here, we check whether the item from the first list has its corresponding
         * square value in the second list. If yes, we decrement the frequency, and
         * if the frequency becomes 0 then we remove it.
         * This operation keep going to the last item, if the condition becomes false during
         * the loops, we break the loop and return false since at least
         * one item does not has its corresponding
         * square value in the second list. Otherwise, we send true.*/
        for (Integer integer : valuesAndFrequencies.keySet()) {
            if (squareValuesAndFrequencies.containsKey(integer * integer)) {
                int frequency = squareValuesAndFrequencies.get(integer * integer);
                squareValuesAndFrequencies.remove(integer * integer);
                if (--frequency > 0) {
                    squareValuesAndFrequencies.put(integer * integer, frequency);
                }
            } else {
                areSquareValuesCorrect = false;
                break;
            }
        }

        return areSquareValuesCorrect;
    }

    /**
     * This method populates the values and their frequencies in a hashmap.
     * It is a linear method.
     * Time complexity; O(n).
     *
     * @param list the list of integers.
     * @return HashMap<Integer, Integer> that the key are the items and the
     * values are the frequencies of the items; how many times the items have occurred
     * in the list
     */
    private HashMap<Integer, Integer> getValuesAndFrequencies(List<Integer> list) {
        HashMap<Integer, Integer> valuesAndFrequencies = new HashMap<>();
        for (Integer integer : list) {
            if (valuesAndFrequencies.containsKey(integer)) {
                int frequency = valuesAndFrequencies.get(integer);
                valuesAndFrequencies.remove(integer);
                valuesAndFrequencies.put(integer, (++frequency));
            } else {
                valuesAndFrequencies.put(integer, 1);
            }
        }
        return valuesAndFrequencies;
    }
}
