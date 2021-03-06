package lnu.se.strategy;

/**
 * An enum that provides two options.
 */
public enum SortOption {
    DESCENDING("2"),
    ASCENDING("1");

    /**
     * A private field for the value.
     */
    private final String value;

    /**
     * A public constructor.
     *
     * @param value the value of the sort option.
     */
    SortOption(String value) {
        this.value = value;
    }

    /**
     * It return the value.
     *
     * @return value.
     */
    public String getValue() {
        return value;
    }
}
