package CreatingPattern.Factory;

public class SmartPhone implements Screen{
    //实现抽象接口的不同的产品
    @Override
    public void light()
    {
        System.out.println("this is SmartPhone light!");
    }
}
