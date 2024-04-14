package Homework26;

public class TestOrderStatus {
    public static void main(String[] args) {

        OrderStatus status = OrderStatus.PENDING;
        System.out.println(status.getDescription());
        System.out.println("Can I cansel the order?" + " " + status.canCansel());
    }
}
