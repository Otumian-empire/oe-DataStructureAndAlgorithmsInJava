package ChapterOne.Creativity;

/**
 * Write a Java method that takes an array containing the set of all integers in the
 * range 1 to 52 and shuffles it into random order. Your method should output each
 * possible order with equal probability. */

import java.util.Arrays;

public class CreativityThree {
    public int[] sampleValue = new int[52];

    public CreativityThree() {
        for (int i = 0; i < 52; i++) {
            sampleValue[i] = i + 1;
        }

        printArray();

        for (int i = 0; i < 10; i++) {
            shuffleAndPrint();
        }
    }

    public static void main(String[] args) {
        new CreativityThree();
    }

    public void printArray() {
        System.out.println( Arrays.toString(sampleValue));
    }

    public void shuffle() {
        for (int i = 0; i < 52; i++) {
            int x = getPosition();
            int y = getPosition();

            while (x == y) {
                x = getPosition();
            }

            int temp = sampleValue[x];
            sampleValue[x] = sampleValue[y];
            sampleValue[y] = temp;
        }
    }

    public int getPosition() {
        return (int) Math.floor(Math.random() * 52 % 52);
    }

    public void shuffleAndPrint() {
        shuffle();
        printArray();
    }
}
