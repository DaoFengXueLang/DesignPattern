package CreatingPattern.Bulider;

public class main {
    public static void main(String[] args) {
        //主要方法，可以选择两种套餐
        //在这种建造者模式下，每个模块(在这里面是鸡肉汉堡 蔬菜汉堡 可口可乐和百事可乐)
        //但是要求在这种建造者模式下，每个模块具有相同的特性，这里面是实现了原型Burger和ColdDrink
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost:"+vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());

    }
}
