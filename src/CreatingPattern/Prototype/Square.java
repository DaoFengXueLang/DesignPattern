package CreatingPattern.Prototype;

public class Square extends Shape {
    //实现的三个形状
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
