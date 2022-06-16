package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
//        Circle circle = new Circle(input.getDouble());

//        System.out.printf("The circle radius is: %.2f\n", circle.getRadius());
//        circle.setRadius(10.0);
//        System.out.printf("The circle radius is: %.2f\n",circle.getRadius());
//        System.out.printf("The circle area is: %.2f\n",circle.getArea());
//        System.out.printf("The circle circumference is: %.2f\n",circle.getCircumference());

        while (true) {
            Circle newCircle = new Circle(input.getDouble());
            newCircle.setCirclesCreated(newCircle.getCirclesCreated() + 1);
            System.out.printf("The circle radius is: %.2f\n", newCircle.getRadius());
            System.out.printf("The circle area is: %.2f\n", newCircle.getArea());
            System.out.printf("The circle circumference is: %.2f\n", newCircle.getCircumference());
            if (input.yesNo() == false) {
                System.out.printf("Circles created: %d",newCircle.getCirclesCreated());
                break;
            }
        }
    }
}
