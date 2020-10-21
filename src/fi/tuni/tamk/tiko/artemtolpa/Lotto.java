package fi.tuni.tamk.tiko.artemtolpa;

import fi.tuni.tamk.tiko.artemtolpa.util.Math;
import fi.tuni.tamk.tiko.artemtolpa.util.*;

/**
 * The class Lotto has three methods: main, AskNumbers and calculatedLotto.
 * The class calculates and displays the time in which the user could win the lottery.
 *
 * @author Artem Tolpa
 */

public class Lotto {
    static int ArraySize = 7;
    static int ArrayMax = 40;
    static int[] userLotto = new int[ArraySize];
    static int[] randomLotto = new int[ArraySize];
    static int weeks = 0;
    static int years = 0;

    /**
     * The main method asks the user for 7 numbers, then randomly selects 7 of the same numbers.
     * As a result, the screen displays the time it took to select a random array (1 week per iteration).
     */

    public static void main(String[] args) {

        AskNumbers();
        do {
            randomLotto = calculateLotto();
            weeks++;
        } while (Arrays.containsSameValues(userLotto, randomLotto) != ArraySize);

        userLotto = Arrays.sort(userLotto);
        Arrays.print("Your Lotto", userLotto);

        System.out.println("You won!");
        years = weeks / 52;
        System.out.println("It tooks " + years + " years (" + weeks + " weeks)!");

    }

    /**
     * The AskNumbers method asks the user for 7 numbers and writes them to the userLotto array.
     * If the number already occurs in the array, the user must enter another number.
     */

    private static void AskNumbers() {
        for (int i = 0; i < userLotto.length; i++) {

        }
        for (int i = 0; i < userLotto.length; i++) {
            int tmp = MyConsole.readInt(1, ArrayMax, "Please give number", "Please give unique number between [1, 40]");

            if (!Arrays.contains(tmp, userLotto)) {
                userLotto[i] = tmp;
            } else {
                System.out.println("Not unique number!");
                i--;
            }
        }
    }

    /**
     * The calculateLotto method writes 7 non-repeating random numbers to the array.
     *
     * @return array with 7 random numbers.
     */

    private static int[] calculateLotto() {
        int random;
        int[] array = new int[ArraySize];
        for (int i = 0; i < array.length; i++) {
            random = Math.getRandom(1, ArrayMax);
            if (!Arrays.contains(random, array))
                array[i] = random;
            else
                i--;
        }
        return array;
    }

}