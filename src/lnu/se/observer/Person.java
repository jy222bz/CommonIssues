package lnu.se.observer;

class Person {

    /**
     * This is a private field for the observer object.
     */
    private Spy spy;


    private int myMoney;

    /**
     * It initializes the observer by setting to the observer of the Object that
     * wants to listen to this Person object.
     *
     * @param spy the observer.
     */
    public void setSpy(Spy spy) {
        this.spy = spy;
    }

    /**
     * We plant the observer in this method, to get
     * live updates about the events.
     * We will know how much money the Person object receives, once this methods
     * gets invoked.
     *
     * @param money the amount of money.
     */
    public void receiveMoney(int money) {
        if (spy != null) {
            spy.collectInfo(money);
        }
        myMoney += money;
    }

    public int getMyMoney() {
        return myMoney;
    }
}
