package CreatingPattern.Prototype;

public class Circle extends Shape {
    //实现的三个形状
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
