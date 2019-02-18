package CreatingPattern.Bulider;

public class Coke extends ColdDrink {
    //可口可乐
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
