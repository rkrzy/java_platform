package Weekend_3;

import java.util.Scanner;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class DeepCopyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point p1 = new Point(sc.nextInt(), sc.nextInt());
        Point p2 = new Point(sc.nextInt(), sc.nextInt());

        Rectangle rectangle1 = new Rectangle(p1, p2);
        Rectangle rectangle2 = new Rectangle(rectangle1);

        rectangle1.moveBy(sc.nextInt(), sc.nextInt());
        sc.close();

        System.out.println(rectangle1);
        System.out.println(rectangle2);
    }
}
public class Rectangle {

    Point Right;
    Point Left;
    public Rectangle(Point p1, Point p2) {
        Right = new Point(p1.getX(),p1.getY());
        Left = new Point(p2.getX(),p2.getY());
    }
    //copy constructor
    public Rectangle(Rectangle rectangle) {
        Right = new Point(rectangle.Right.getX(),rectangle.Right.getY());
        Left = new Point(rectangle.Left.getX(),rectangle.Left.getY());
    }

    public void moveBy(int x, int y) {
        Right.setX(Right.getX()+x);
        Right.setY(Right.getY()+y);
        Left.setX(Left.getX()+x);
        Left.setY(Left.getY()+y);
    }

    @Override
    public String toString() {

        return String.format("Rectangle[(%d,%d),(%d,%d)]\n",Right.getX(),Right.getY(),Left.getX(),Left.getY());
    }
}

