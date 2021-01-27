package lnu.se.enum_example;

import java.util.Scanner;

public class InputHandler {
    /**
     * It processes integer input and it returns the enum that its value corresponds to the
     * input integer.
     *
     * @return Guess
     */
    public Guess processIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        Guess guess = Guess.INVALID;
        try {
            int input = scanner.nextInt();
            Guess[] guesses = Guess.values();
            for (Guess someGuess : guesses) {
                if (input == someGuess.getValue()) {
                    guess = someGuess;
                }
            }
        } catch (Exception ex) {
            return guess;
        }
        scanner.close();
        return guess;
    }

    /**
     * It processes char input and it returns the enum that its char corresponds to the
     * input integer.
     *
     * @return Guess
     */
    public Guess processCharInput() {
        Scanner scanner = new Scanner(System.in);
        Guess guess = Guess.INVALID;
        String input = scanner.next();
        if (input.length() > 1) {
            return Guess.INVALID;
        }
        Guess[] guesses = Guess.values();
        for (Guess someGuess : guesses) {
            if (input.toLowerCase().charAt(0) == someGuess.getLetter()) {
                guess = someGuess;
            }
        }
        scanner.close();
        return guess;
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
