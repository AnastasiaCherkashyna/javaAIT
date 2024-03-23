package lesson20HW;

import java.util.ArrayList;

public class TestPurchaseHW {
    public static void main(String[] args) {
        ArrayList<PurchaseHW> goods = new ArrayList<>();
            PurchaseHW purchaseHWOne = new PurchaseHW("Ananas", 5); // создали объект класса
            PurchaseHW purchaseHWTwo  = new PurchaseHW("Kiwi", 3);// создали еще один объект класса

        goods.add(purchaseHWOne);
        goods.add(purchaseHWTwo);


        PurchaseHW.addPurchaseInList(goods, "Mango", 4);
        PurchaseHW.addPurchaseInList(goods, "Kartofeln", 2.5);
        PurchaseHW.addPurchaseInList(goods, "Zitrone", 5);

        // System.out.println(goods);

        PurchaseHW.printPurchase(goods);
        PurchaseHW.searchPurchase(goods, "Kiwi");
        PurchaseHW.cleanPurchase(goods, "Mango");
        PurchaseHW.printPurchase(goods); // еще раз выводу списко на экран для проверки удаления товара.
    }
}
