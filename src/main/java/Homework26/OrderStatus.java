package Homework26;

public enum OrderStatus {
    PENDING("Order is pending approval"),
    PROCESSING("Order is in process"),
    SHIPPED("Order is shipped"),
    DELIVERED("Order is delivered"),
    CANCELLED("Order is canceled");

    private String description;

    public static String getDescription(OrderStatus orderStatus, String description) {
        return description;
    }


    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

public boolean canCansel () {
       return this == PENDING || this == PROCESSING;
}
}
