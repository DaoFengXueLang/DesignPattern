package CreatingPattern.Prototype;

public class Rectangle extends Shape {
    //实现的三个形状
    public Rectangle()
    {
        type  = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
