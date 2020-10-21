package fi.tuni.tamk.tiko.artemtolpa.util;

/**
 * The class Arrays contains methods that convert
 * String array to int array, check if the given value is in the array
 * and check if two arrays have the same values.
 *
 * @author Artem Tolpa
 */

public class Arrays {

    /**
     * The toIntArray method transforms String array elements into
     * numbers using the parseInt method.
     *
     * @param array the String array that contains numbers as text
     * @return int array obtained after transformation
     */

    public static int[] toIntArray(String[] array) {
        int[] intarray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intarray[i] = Integer.parseInt(array[i]);
        }
        return intarray;
    }

    /**
     * The contains method checks if the given value is in the array.
     * <p>
     * If the value is found, then the method returns true, else returns false.
     * A linear search algorithm is used to find the value.
     *
     * @param value the given value to look for in the array.
     * @param array array to search.
     * @return true if the value was found, false if the value was not found.
     */

    public static boolean contains(int value, int[] array) {
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                found = true;

        }
        return found;
    }

    /**
     * The containsSameValues method compares two arrays, checking if they have the same values.
     * <p>
     * The method uses a nested for loop to compare arrays.
     * The method contains a counter that increments its value
     * every time the same values are found in the arrays.
     *
     * @param array1 first array to compare.
     * @param array2 second array to compare.
     * @return number of same values.
     */

    public static int containsSameValues(int[] array1, int[] array2) {
        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j])
                    counter++;
            }
        }
        return counter;
    }

    /**
     * The sort method sorts the array in ascending order.
     * Selective sort is used as a sorting algorithm.
     *
     * @param numbers the array to be sorted.
     * @return sorted array.
     */

    public static int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int min = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[min]) {
                    min = j;
                }
            }
            int tmp = numbers[i];
            numbers[i] = numbers[min];
            numbers[min] = tmp;
        }
        return numbers;
    }

    /**
     * The print method method prints the elements of the array.
     *
     * @param description description of array you want to print. For example: "User Lotto", "Random Lotto", etc.
     * @param array       the array whose elements you want to print.
     */

    public static void print(String description, String[] array) {
        System.out.print(description + ": ");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1)
                System.out.print(array[i]);
            else
                System.out.print(array[i] + ", ");
        }
        System.out.println("]");
    }

    /**
     * The prefix method adds a prefix "0" to the elements of the array.
     *
     * @param array the given array, to the elements of which you want to add a prefix.
     * @return ready array with prefixes.
     */

    public static String[] prefix(int[] array) {
        String[] prefixArray = new String[array.length];
        for (int i = 0; i < prefixArray.length; i++) {
            prefixArray[i] = "";
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 10)
                prefixArray[i] = "0" + array[i];
            else
                prefixArray[i] += array[i];
        }
        return prefixArray;
    }
}

