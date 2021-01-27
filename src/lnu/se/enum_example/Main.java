package lnu.se.enum_example;


public class Main {

    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        inputHandler.print("It is a guessing game! Enter a number from 1-10: ");
        Guess guess = inputHandler.processIntegerInput();
        inputHandler.printMessage(guess.getDescription());
        inputHandler.print("It is a guessing game! Enter a letter from a-z: ");
        Guess guess2 = inputHandler.processCharInput();
        inputHandler.printMessage(guess2.getDescription());
    }
}

