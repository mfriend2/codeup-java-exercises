package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Square square = new Square(4);
//        System.out.println(square.getArea());
//        System.out.println(square.getPerimeter());
//        System.out.println(square.getLength());
//        System.out.println(square.getWidth());
        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
        Measurable myShape = new Rectangle(4, 5);
        Measurable myShape2 = new Square(4);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());
    }
}
