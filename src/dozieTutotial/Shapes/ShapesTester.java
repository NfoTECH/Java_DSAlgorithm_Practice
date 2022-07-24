package dozieTutotial.Shapes;

public class ShapesTester {
    public static void main(String[] args) {

        /***************
        * RECTANGLE 1
        ***************/

        //Create instance of Rectangle class
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(25);
        rectangle.setLength(50);

        rectangle.getArea();
        rectangle.getPerimeter();

        /***************
        * RECTANGLE 2
        ***************/

        //Create instance of Rectangle class
        Rectangle rectangle2 = new Rectangle(6.7, 2.5);
        rectangle2.getArea();
        rectangle2.getPerimeter();
    }
}
