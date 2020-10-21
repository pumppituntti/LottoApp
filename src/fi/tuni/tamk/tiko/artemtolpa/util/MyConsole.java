package fi.tuni.tamk.tiko.artemtolpa.util;

import java.io.Console;

/**
 * The class MyConsole contains method that asks the user to enter a number.
 *
 * @author Artem Tolpa
 */

public class MyConsole {

    /**
     * The readInt method asks the user to enter a number.
     * <p>
     * If the user entered a character other than a number,
     * the loop starts over and runs until the user enters a number.
     * The method also checks that the number entered by the user
     * does not go beyond [min, max].
     *
     * @param min                      minimum allowable value.
     * @param max                      maximum allowable value.
     * @param errorMessageNonNumeric   the error message that the user sees if input is incorrect.
     * @param errorMessageNonMinAndMax error message that the user sees if the number is out of range
     * @return user entered number
     */

    public static int readInt(int min, int max, String errorMessageNonNumeric, String errorMessageNonMinAndMax) {

        System.out.println("Please give unique number from " + min + " to " + max);
        Console c = System.console();
        int input = min - 1;
        boolean number = false;

        while (!number) {
            try {
                do {
                    input = Integer.parseInt(c.readLine());
                    if (input < min || input > max) {
                        System.out.println(errorMessageNonMinAndMax);
                        System.out.println("Try again!");
                    } else
                        number = true;
                } while (input < min || input > max);
            } catch (NumberFormatException e) {
                System.out.println(errorMessageNonNumeric);
                System.out.println("Try again!");
            }
        }
        return input;
    }
}