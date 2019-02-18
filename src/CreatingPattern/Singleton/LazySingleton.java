package CreatingPattern.Singleton;

public class LazySingleton {
    //这里创建一个空的static实例对象
    private static LazySingleton lazy;
    //私有构造方法
    private LazySingleton(){}
    //当调用实例方法时候判断是否存在非空实例，若存在非空实例则返回够则新建一个实例
    public static LazySingleton getSingleton()
    {
        if(lazy == null)
        {
            lazy = new LazySingleton();
            return lazy;
        }
            return lazy;
    }
    public void print()
    {
        System.out.println("this is lazysingleton!");
    }



}
