package lesson22HW;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Property {
    private String adress;

    private String type;

    public Property(String adress, String type) {
        this.adress = adress;
        this.type = type;
    }
    public String getAdress() {
        return adress;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return Objects.equals(adress, property.adress) && Objects.equals(type, property.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adress, type);
    }

    @Override
    public String toString() {
        return "Property{" +
                "adress='" + adress + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public static void filterByType(HashSet<Property> propertyHashSet, String propertyType) {
        HashSet<Property> filter = new HashSet<>();
        boolean isFound = false;
        for(Property property : propertyHashSet ) {
            if (property.getType().equals(propertyType)) {
                filter.add(property);
                isFound = true;
                System.out.println(filter);
            }
        }
        if (!isFound) {
            System.out.println("Error");
        }
    }
    public static void compareSets (HashSet<Property> propertyHashSet, HashSet<Property> NewPropertyHashSet) {
        HashSet<Property> compare = new HashSet<>(propertyHashSet);
        compare.removeAll(NewPropertyHashSet);
        System.out.println(compare);
    }
}
