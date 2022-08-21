package com.flightofdream.purchasesBasket;

import java.util.ArrayList;

public interface BasketService {
    void addPurchase(int... purchaseNumbers);
    ArrayList<Integer> getPurchases();
}
