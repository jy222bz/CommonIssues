package lnu.se.strategy;


import java.util.Scanner;

/**
 * A class provides a method for input handler.
 */
public class InputHandler {


    /**
     * It processes the input and it returns the enum that its value corresponds to the
     * input.
     *
     * @return SortOption
     */
    public SortOption processInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        SortOption sortOption = null;
        SortOption[] options = SortOption.values();
        for (SortOption someOption : options) {
            if (input.equals(someOption.getValue())) {
                sortOption = someOption;
                break;
            }
        }

        return sortOption;
    }
}
