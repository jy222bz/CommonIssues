package lnu.se.observer;

public class Main {
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
        Spy mySpy = Helper::displayTheCollectedInfo;
        person.setSpy(mySpy);
        person.receiveMoney(100);
    }
}