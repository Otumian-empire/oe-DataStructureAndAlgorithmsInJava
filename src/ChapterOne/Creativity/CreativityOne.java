package ChapterOne.Creativity;

/*
 * Write a short Java function that takes an array of int values and determines if
 * there is a pair of numbers in the array whose product is odd.
 * */

import java.util.Arrays;

public class CreativityOne {
    public CreativityOne() {
        int[] sampleValues = {1, 4, 6, 8};
        String text = Arrays.toString(sampleValues) + " has a pair whose product is odd: ";
        System.out.println(text + hasPairWithOddProduct(sampleValues));
    }

    public static void main(String[] args) {
        new CreativityOne();
    }

    public boolean hasPairWithOddProduct(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = i + 1; j < values.length; j++) {
                int product = values[i] * values[j];

                if (isOdd(product)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isOdd(int value) {
        return value % 2 == 1;
    }
}
