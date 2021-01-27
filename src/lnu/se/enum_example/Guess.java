package lnu.se.enum_example;

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
