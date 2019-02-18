package CreatingPattern.Bulider;

public class ChickenBurger extends Burger {
    //鸡肉汉堡
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
