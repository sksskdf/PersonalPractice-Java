package RuntimeTypeChecking;

class Shape { }

class Circle extends Shape { }

class Rectangle extends Shape { }

public class ex1 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape circle = new Circle();
        Shape rect = new Rectangle();

        boolean circleIsCircle = circle instanceof Circle;
        System.out.println(circleIsCircle);
        System.out.println();

        boolean rectIsShape = rect instanceof Shape;
        System.out.println(rectIsShape);
        System.out.println();

        boolean shapeIsCircle = shape instanceof Circle;
        System.out.println(shapeIsCircle);
        System.out.println();

        System.out.println(Shape.class.isInstance(shape));
        System.out.println();

        System.out.println(Circle.class.isInstance(circle));
        System.out.println();

        System.out.println(Circle.class.isInstance(shape));
        System.out.println();

        System.out.println(Shape.class.isInstance(circle));
        System.out.println();

        Object obj = " ";
        if (obj instanceof String str && str.length() > 0) {
            if (str.isBlank()) {
                System.out.println("The ~~~~~~~~~~~~~~~~~~~~~");
            }
        }

        System.out.println(circle.getClass()==Circle.class);
        System.out.println(Rectangle.class.isInstance(rect));
    }

}
