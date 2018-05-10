package shapes;

public class Square extends Quadrilateral {


    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}
////Override
//public int  getPerimeter() {
//    return 4 * side;
//}
//
//    public int getArea() {
//        return side * side;
//    }
//
//}
