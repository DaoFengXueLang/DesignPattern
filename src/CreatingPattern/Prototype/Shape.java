package CreatingPattern.Prototype;

public abstract class Shape implements Cloneable{
    //一个抽象类(不是接口的原因是方形圆形都和形状是一个Is-a的关系)，而非Bulider模式中Has-a的关系
    //该类实现了基本的、私有的数据域和相对应的pojo方法
    //实现并重写了父类的clone方法
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //一个受保护的变量，只能由该类、子类和本包使用，严格来讲输入导出API的一部分
    protected String type;

    public String getType() {
        return type;
    }

    abstract void draw();

    //重写父类的Clone方法
    @Override
    protected Object clone() {
        Object clone = null;
        try{
            clone = super.clone();
        }catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }
}
