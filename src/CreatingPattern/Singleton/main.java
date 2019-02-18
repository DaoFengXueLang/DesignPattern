package CreatingPattern.Singleton;

public class main {
    public static void main(String[] args) {
        HungerSingleton onlyone = HungerSingleton.getSingleton();
        onlyone.print();
        LazySingleton onlytwo  = LazySingleton.getSingleton();
        onlytwo.print();
        EnumSingleton.INSTANCE.print();
    }
}
