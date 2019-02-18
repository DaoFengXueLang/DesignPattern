package CreatingPattern.Bulider;

public abstract class Burger implements Item {
    //具体的商品种类之一，汉堡
    //纸袋装
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
   public abstract float price();
}
