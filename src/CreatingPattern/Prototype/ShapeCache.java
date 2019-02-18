package CreatingPattern.Prototype;


import java.util.Hashtable;

public class ShapeCache {
    //存储在一个实现了泛型接口的Hashtable上
    private static Hashtable<String,Shape> shapeMap
            =new Hashtable<String,Shape>();
    //一个工厂方法，当获得对象时候，返还一个该对象克隆的副本
    public static Shape getShape(String shapeId)
    {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape)cachedShape.clone();
    }
    //将所有的原始对象放到一个Hashtable当中，当调用getShape的时候，返回当前对象的一个副本
    public static void loadCache()
    {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),square);
    }
}
