package shapes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    private static int circlesCreated = 0;

    public int getCirclesCreated() {
        return circlesCreated;
    }

    public void setCirclesCreated(int circlesCreated) {
        this.circlesCreated = circlesCreated;
    }
}
