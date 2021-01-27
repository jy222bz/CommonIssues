package lnu.se.conditions;


import java.util.Scanner;

public class Resource {

    /**
     * It processes the input and prints it.
     * It is important to free the resource once you are done using it, i.e.
     * calling: scanner.close(); at the end of the method.
     * In this example, we are using scanner and scanner uses stream and
     * we cannot be sure when a garbage collection cycle will start,
     * thus, the input stream can consume computer resources for an indefinite period of time.
     *
     */
    public void printInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
    }
}
