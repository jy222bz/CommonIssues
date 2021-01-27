package lnu.se.observer;

/**
 * This is an observer interface.
 */
interface Spy {

    /**
     * This method listens to events when they change.
     * We want to know how much money,
     * the Person object receives, so this method will give us update about that.
     *
     * @param amount the amount of money the Person object gets.
     */
    void collectInfo(int amount);
}
