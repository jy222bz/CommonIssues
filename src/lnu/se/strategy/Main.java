package lnu.se.strategy;

import java.util.Scanner;

/**
 * To demonstrate the strategy pattern.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] data = {3, 4, 8, -12, 16, 1, 20, 25};
        InputHandler inputHandler = new InputHandler();
        Factory factory = new Factory();
        System.out.println("Data: 3, 4, 8, -12, 16, 1, 20, 25");
        System.out.println("How would you like to sort the data?\nAscending: Press 1\nDescending: Press 2");
        System.out.print("Provide your choice:  ");
        SortOption sortOption = inputHandler.processInput();
        if (sortOption == null) {
            System.out.println("Invalid Input! Bye!");
        } else {
            Sorter sorter = factory.getSorter(sortOption);
            data = sorter.sort(data);
            System.out.println("Data sorted:  ");
            for (int number : data) {
                System.out.println(number);
            }
        }
        scan.close();
    }
}
