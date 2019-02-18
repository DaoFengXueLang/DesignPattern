package CreatingPattern.Bulider;

public class Wrapper implements Packing{
    //商品的包装种类之一，纸装
    @Override
    public String pack() {
        return "Wrapper!";
    }
}
