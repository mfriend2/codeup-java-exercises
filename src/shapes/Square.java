package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    void setWidth(double width) {
        this.length = width;
        this.width = width;
    }

//    public double getArea() {
//        return side * side;
//    }
//
//    public double getPerimeter() {
//        return 4 * this.side;
//    }


}
