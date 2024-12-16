package Rectangle;

import java.sql.PreparedStatement;

public class Rectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle);

        rectangle.setLength(10);
        rectangle.setWidth(20);
        System.out.println(rectangle);

    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private int length;

    public void setWidth(int width) {
        this.width = width;
    }

    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return String.format("Rectangle [length=%d, width=%d, area=%d, perimeter=%d]", length, width, getArea(), getPerimeter());
    }
}
