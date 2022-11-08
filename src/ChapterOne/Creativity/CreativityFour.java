package ChapterOne.Creativity;


/** TODO: not done
 * Write a short Java program that outputs all possible strings formed by using the
 * characters 'c', 'a', 'r', ' b', ' o', and 'n' exactly once.
 */

public class CreativityFour {
    public CreativityFour() {

        String str = "carbon";
        int strLength = str.length();

        for (int i = 0; i < strLength; i++) {
            for (int j = 0; j < strLength; j++) {
                String temp = str;
                System.out.print(temp.charAt(j));
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        new CreativityFour();
    }
}
