package lesson22HW;

import java.util.HashSet;

public class TestProperty {
    public static void main(String[] args) {

        // Task 1
        Property firstProperty = new Property("Munich", "Flat");
        Property secondProperty = new Property("Ingolstadt", "Hause");
        Property thirdProperty = new Property("Nurnberg", "WG");
        Property fourthProperty = new Property("Nurnberg", "WG");
        Property fifthProperty = new Property("Munich", "Flat");

        Property sixProperty = new Property("Munich", "Flat");
        Property sevenProperty = new Property("Berlin", "Penthaus");
        Property eightProperty = new Property("Augsburg", "Penthaus");


        HashSet<Property> propertyHashSet = new HashSet<>();

        propertyHashSet.add(firstProperty);
        propertyHashSet.add(secondProperty);
        propertyHashSet.add(thirdProperty);
        propertyHashSet.add(fourthProperty);
        propertyHashSet.add(fifthProperty);

        HashSet<Property> NewPropertyHashSet = new HashSet<>();

        NewPropertyHashSet.add(sixProperty);
        NewPropertyHashSet.add(sevenProperty);
        NewPropertyHashSet.add(eightProperty);

        System.out.println(propertyHashSet);
        System.out.println("-------------2-----------");


        // Task 2
        Property.filterByType(propertyHashSet, "Hause");

        //Task 3
        System.out.println("----------3------------");

        Property.compareSets(propertyHashSet, NewPropertyHashSet);












    }
}
