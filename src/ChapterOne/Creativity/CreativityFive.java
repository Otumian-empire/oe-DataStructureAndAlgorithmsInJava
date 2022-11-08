package ChapterOne.Creativity;

/**
 * Write a short Java program that takes all the lines input to standard input and
 * writes them to standard output in reverse order. That is, each line is output in the
 * correct order, but the ordering of the lines is reversed.
 */
public class CreativityFive {
    public CreativityFive() {
        System.out.println(reverseString("Hello"));
    }

    public static void main(String[] args) {
        new CreativityFive();
    }

    public String reverseString(String str) {
        StringBuilder newString = new StringBuilder();

        for (int i = str.length(); i > 0; i--) {
            newString.append(str.charAt(i - 1));
        }

        return newString.toString();
    }
}
