package CreatingPattern.Bulider;

public class VegBurger extends Burger {

    //蔬菜汉堡，继承了汉堡的种类
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
