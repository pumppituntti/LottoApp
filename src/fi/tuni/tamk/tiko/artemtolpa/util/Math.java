package fi.tuni.tamk.tiko.artemtolpa.util;

public class Math {
    /**
     * The getRandom method returns a random number in the range [min, max].
     *
     * @param min minimum allowable value.
     * @param max maximum allowable value.
     * @return random number.
     */
    public static int getRandom(int min, int max) {

        return min + (int) (java.lang.Math.random() * ((max - min) + 1));

    }

}