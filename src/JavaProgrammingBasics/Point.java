package JavaProgrammingBasics;

public class Point implements IPoint {
    private int x = 0;
    private int y = 0;
    private Point next = null;

    public Point() {
    }

    public Point(int xCord, int yCord) {
        x = xCord;
        y = yCord;
    }

    public int getX() {
        return x;
    }

    public void setX(int xCord) {
        x = xCord;
    }

    public int getY() {
        return y;
    }

    public void setY(int yCord) {
        y = yCord;
    }

    public Point getNext() {
        return next;
    }

    public void setNext(Point nextPoint) {
        next = nextPoint;
    }

    @Override
    public String toString() {
        return "Point(x=" + x + ",y=" + y + ")";
    }

    public boolean equals(Point obj) {
        if (this == obj) return true;

        return (this.x == obj.getX() && this.y == obj.getY());
    }

    public Point clone() {
        return new Point(getX(), getY());
    }
}
