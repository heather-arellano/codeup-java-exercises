package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4, 5);
//        Rectangle box2 = new Square(5);
//
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

    Measurable myShape;


    myShape = new Rectangle (4,5);
    myShape = new Square(5);


    myShape.getPerimeter();
        System.out.println("The perimeter of this shape is"+ myShape.getPerimeter());

    myShape.getArea();
        System.out.println("The area of this shape is"+ myShape.getArea());



    }
}
