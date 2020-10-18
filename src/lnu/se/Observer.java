package lnu.se;

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

public class Observer {
    public static void main(String[] args) {
        /*
         * Here where we want to listen to the events and
         * act based on the information we get from the observer.
         * Here the Person object will be used.
         * We will initializes the Observer interface and implement it
         * to decide what to do with the information we get
         * when the Person object gets money.
         * We set the observer in the Person to start listening to the events.
         * Do not use in-line comments. I use them here just to explain the code,
         * otherwise, I would never use them, neither should you!
         * */
        Person person = new Person();
        /* We use the method reference to implement the observer.
         * In the end of the day, we want to do something with the
         * information we collect by the observer-
         * in this case we call the static method by referencing it,
         * to display the information.*/
        Spy mySpy = Observer::displayTheCollectedInfo;
        person.setSpy(mySpy);
        person.receiveMoney(100);
    }

    private static void displayTheCollectedInfo(int amount) {
        System.out.println("By using the observer, I got to know that the Person object" +
                " just got this amount of money: " + amount + ".");
    }
}