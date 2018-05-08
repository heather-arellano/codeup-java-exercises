package shape;

public class Rectangle {
    protected int length;
    protected int width;


public Rectangle() {}

public Rectangle (int length, int width) {
    this.length = length;
    this.width = width;
}
public int  getPerimeter() {
    return 2 * width + 2 * length;
}

public int getArea() {
    return  width * length;
}
}
