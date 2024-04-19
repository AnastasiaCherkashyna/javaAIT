package Homework26;

import java.util.HashSet;

public class TestMenu {
    public static void main(String[] args) {

        // 1 Var
        HashSet<MenuItem> menuItemHashSet = new HashSet<>();
        menuItemHashSet.add(new MenuItem("Tea", MenuItemType.DRINK));
        menuItemHashSet.add(new MenuItem("Water", MenuItemType.DRINK));
        menuItemHashSet.add(new MenuItem("Cake", MenuItemType.DISH));
        menuItemHashSet.add(new MenuItem("Pasta", MenuItemType.DISH));

        // 2 Var

        MenuItem menuItemDrink = new MenuItem("Caffee", MenuItemType.DRINK);
        MenuItem menuItemColdDrink = new MenuItem("Schorle", MenuItemType.DRINK);
        MenuItem menuItemDish = new MenuItem("Pizza", MenuItemType.DISH);
        MenuItem menuItemColdDisch = new MenuItem("Salat", MenuItemType.DISH);

        //Var 3
        MenuItem soup = new MenuItem("Gaspacho", MenuItemType.DISH);


        System.out.println(menuItemHashSet);
        System.out.println(soup);
        System.out.println("----2----");
        System.out.println(menuItemDish.getName() + " und " + menuItemDrink.getName());
        System.out.println(menuItemColdDisch.getName() + " und " + menuItemColdDrink.getName());

    }
}
