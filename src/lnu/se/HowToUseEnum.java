package lnu.se;

import java.util.Scanner;

public class HowToUseEnum {

    public static void main(String[] args) {
        Duplications printer = new Duplications();
        printer.print("It is a guessing game! Enter a number from 1-10: ");
        Guess guess = processIntegerInput();
        printer.printMessage(guess.getDescription());
        printer.print("It is a guessing game! Enter a letter from a-z: ");
        Guess guess2 = processCharInput();
        printer.printMessage(guess2.getDescription());
    }

    /**
     * It processes integer input and it returns the enum that its value corresponds to the
     * input integer.
     *
     * @return Guess
     */
    private static Guess processIntegerInput() {
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
    private static Guess processCharInput() {
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
}

enum Guess {

    /**
     * Enum with multiple properties.
     */
    GUESS1(1, "You have guessed the first guess!", 'a'),
    GUESS2(2, "You have guessed the second guess!", 'b'),
    INVALID(-1, "Either it is a wrong guess or invalid input!", '*');

    /**
     * A private field for the value of the guess.
     */
    private final int value;
    /**
     * A private field for the description of the guess.
     */
    private final String description;
    /**
     * A private field for the letter of the guess.
     */
    private final char letter;

    /**
     * A constructor that initializes the variables.
     *
     * @param value       the value.
     * @param description the description.
     * @param letter      the letter.
     */
    Guess(int value, String description, char letter) {
        this.value = value;
        this.description = description;
        this.letter = letter;
    }

    /**
     * The following methods are getters!
     */
    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public char getLetter() {
        return letter;
    }
}