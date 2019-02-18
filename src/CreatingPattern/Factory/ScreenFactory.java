package CreatingPattern.Factory;

public class ScreenFactory {
   //一个工厂模式方法
    public Screen getScreen(String ScreenType)
    {
        if(ScreenType == null){
            return null;
        }else if(ScreenType.equalsIgnoreCase("Computer")){
            return new Computer();
        }else if(ScreenType.equalsIgnoreCase("MP3"))
        {
            return new MP3();
        }else if(ScreenType.equalsIgnoreCase("SmartPhone")){
            return new SmartPhone();
        }
    return  null;
    }
}
