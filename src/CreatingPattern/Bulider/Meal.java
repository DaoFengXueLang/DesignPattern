package CreatingPattern.Bulider;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    //一个午饭选择器，可以往午饭中添加物品、获得价格、和显示现在的条目信息
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item)
    {
        items.add(item);

    }

    public float getCost()
    {
        float cost = 0.0f;
        for(Item item:items)
        {
            cost += item.price();
        }
        return cost;
    }

    public void showItems()
    {
        for(Item item:items)
        {
            System.out.print("Items:"+item.name());
            System.out.print(",Packing:"+item.packing().pack());
            System.out.println(",Price:"+item.price());
        }
    }
}
