package CreatingPattern.Bulider;

public abstract class ColdDrink implements Item{
    //基本的商品种类之二，冷饮
    //瓶装
    @Override
    public Packing packing() {
        return new Bottle();
    }
    @Override
    public abstract float price();
}
