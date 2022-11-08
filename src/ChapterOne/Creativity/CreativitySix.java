package ChapterOne.Creativity;

import java.util.Arrays;

/**
 * Write a short Java program that takes two arrays a and b of length n storing int
 * values, and returns the dot product of a and b. That is, it returns an array c of
 * length n such that c[i] = a[i] · b[i], for i = 0,… ,n − 1.
 */
public class CreativitySix {

    public CreativitySix() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 4, 6, 1, 3};
        int n = 5;

        int[] c = dotProduct(a, b, n);

        System.out.println("The dot product of " + printArray(a) + " and " + printArray(b) + " is " + printArray(c));
    }

    public static void main(String[] args) {
        new CreativitySix();
    }

    public int[] dotProduct(int[] a, int[] b, int n) {
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = a[i] * b[i];
        }

        return c;
    }

    public String printArray(int[] sampleValue) {
        return Arrays.toString(sampleValue);
    }
}
