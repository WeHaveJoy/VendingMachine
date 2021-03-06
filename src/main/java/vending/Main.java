package vending;


import vending.products.SoftDrink;
import vendingExtendable.ExtendableVendingMachine;

public class Main {
    public static void main(String[] args) {
        OverloadedVM purchase = new OverloadedVM(2,2,2);
        purchase.buy(new SoftDrink(), 2);

        ExtendableVendingMachine extend = new ExtendableVendingMachine(1,1,1, 1);
        extend.add(new SoftDrink());
        extend.getStock(new SoftDrink());
    }
}
