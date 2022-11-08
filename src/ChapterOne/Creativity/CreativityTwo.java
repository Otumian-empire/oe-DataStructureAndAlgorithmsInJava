package ChapterOne.Creativity;

import java.util.Arrays;

/*
 * Write a Java method that takes an array of int values and determines if all the
 * numbers are different from each other (that is, they are distinct).
 * */
public class CreativityTwo {
    public CreativityTwo() {
        int[] distinctValues = {1, 4, 6, 8}, nonDistinctValues = {1, 4, 1, 8};
        printMessage(distinctValues);
        printMessage(nonDistinctValues);
    }

    public static void main(String[] args) {
        new CreativityTwo();
    }

    public void printMessage(int[] sampleValues) {
        String text = Arrays.toString(sampleValues) + " has distinct values: ";
        System.out.println(text + hasDistinctValues(sampleValues));
    }

    private Boolean hasDistinctValues(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (isTheSame(values[i], values[j])) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isTheSame(int a, int b) {
        return a == b;
    }
}
