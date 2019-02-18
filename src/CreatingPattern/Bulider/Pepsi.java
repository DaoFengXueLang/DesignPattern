package CreatingPattern.Bulider;

public class Pepsi extends ColdDrink {
    //百事可乐
    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
