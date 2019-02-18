package CreatingPattern.Singleton;

//饿汉模式的单例模式
public class HungerSingleton {
    //私有构造方法
    private HungerSingleton()
    {

    }
    //未调用方法之前优先加载一个static实例
    //该种方法的缺陷在于在未调用方法之前先加载了一个实例，浪费了空间。
    /*是否 Lazy 初始化：否
      是否多线程安全：是
      实现难度：易
    */
    private static HungerSingleton singleton =  new HungerSingleton();

    public static HungerSingleton getSingleton()
    {
        return singleton;
    }
    public void print()
    {
        System.out.println("this is hungersingleton!");
    }

}
