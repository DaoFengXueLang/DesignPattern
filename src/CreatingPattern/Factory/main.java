package CreatingPattern.Factory;


public class main {
    //工厂模式方法
    public static void main(String[] args) {
        ScreenFactory factory = new ScreenFactory();
        Screen mp3 = factory.getScreen("mp3");
        mp3.light();
        Screen computer = factory.getScreen("Computer");
        computer.light();
        Screen smartphone = factory.getScreen("smartphone");
        smartphone.light();


    }
}
