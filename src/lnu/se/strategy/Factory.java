package lnu.se.strategy;

/**
 * A factory class.
 */
public class Factory {


    /**
     * It creates object based on the sort option.
     *
     * @param sortOption the sort option.
     * @return the sorter object.
     */
    public Sorter getSorter(SortOption sortOption) {
        if (sortOption == SortOption.ASCENDING) {
            return new SortAscending();
        } else if (sortOption == SortOption.DESCENDING) {
            return new SortDescending();
        }
        return null;
    }
}
