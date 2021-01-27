package lnu.se.duplications;

public class Duplications {

    /**
     * Essentially this method prints a fixed string.
     * Perhaps, this method will be used a few times, given its condition.
     */
    public void printHello() {
        System.out.println("Hello!");
    }

    /**
     * Essentially this method prints a fixed string also, just like the above.
     * While both the above method and this method are printing different values,
     * but they still are duplicated methods.
     */
    public void printGoodBye() {
        System.out.println("Good Bye!");
    }

    /**
     * This method is more flexible, where you can pass the value you want to print.
     * This way you can reduce the amount of duplications and dynamically use it.
     * This method is more flexible where it can be used frequent.
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    public void print(String message) {
        System.out.print(message);
    }
}
