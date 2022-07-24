package dozieTutotial.Shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length; //can be set this way
        setWidth(width); //this works fine too
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        double area = length * width;
        System.out.println("The area of the rectangle is " + area);
        return area;
    }

    public double getPerimeter() {
        double perimeter = (2 * length) + (2 * width);
        System.out.println("The perimeter of the rectangle is " + perimeter);
        return perimeter;
    }


}
