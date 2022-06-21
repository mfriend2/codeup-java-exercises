package shapes;

public class Square extends Quadrilateral {
    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    void setLength(double length) {
        this.length = length;
        this.length = width;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
        this.width = length;
    }

//    public double getArea() {
//        return side * side;
//    }
//
//    public double getPerimeter() {
//        return 4 * this.side;
//    }


}
