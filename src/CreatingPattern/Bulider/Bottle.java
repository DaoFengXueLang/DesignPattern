package CreatingPattern.Bulider;

public class Bottle implements Packing{
    //商品的包装种类之一，瓶装
    @Override
    public String pack() {
        return "Bottle!";
    }
}
