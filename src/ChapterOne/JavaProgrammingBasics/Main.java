package ChapterOne.JavaProgrammingBasics;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello here!!");

        Point point = new Point(2,4);
        Point point1 = new Point(4,7);

        System.out.println(point);
        point.setNext(point1);

        System.out.println(point.getNext());

        Point point2 = point.clone();
        System.out.println(point2);
    }
}
