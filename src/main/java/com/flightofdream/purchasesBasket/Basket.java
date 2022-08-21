package com.flightofdream.purchasesBasket;

import java.util.ArrayList;

public class Basket {
private ArrayList<Integer> purchases;

    public Basket(ArrayList<Integer> purchases) {
        this.purchases=purchases;
    }

    public ArrayList<Integer> getPurchases() {
        return purchases;
    }

    public void setPurchases(ArrayList<Integer> purchases) {
        this.purchases = purchases;
    }
}
