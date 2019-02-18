package CreatingPattern.Bulider;

public interface Item {
    //最基本接口，规定了商品的属性，即名称、包装和价格
    String name();
    //在这规定了一个返回值为包装类型的接口，也是商品本身的属性
    Packing packing();
    float price();

}
