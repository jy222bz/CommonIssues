package lnu.se.strategy;

/**
 * An enum that provides two options.
 */
public enum SortOption {
    DESCENDING("2", "Descending Order"),
    ASCENDING("1", "Ascending Order");

    /**
     * A private field for the value.
     */
    private final String value;

    /**
     * A private field for the sort order.
     */
    private final String order;

    /**
     * A public constructor.
     *
     * @param value the value of the sort option.
     * @param order the sorting order.
     */
    SortOption(String value, String order) {
        this.value = value;
        this.order = order;
    }

    /**
     * It return the value.
     *
     * @return value.
     */
    public String getValue() {
        return value;
    }

    /**
     * It return the order.
     *
     * @return order.
     */
    public String getOrder() {
        return order;
    }
}
