package com.flightofdream.purchasesBasket;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

@Service
@Scope(scopeName = "prototype")
public class BasketServiceImpl implements BasketService{
  ArrayList<Integer> purchases=new ArrayList<>();
  private final   Basket basket=new Basket(purchases);
    public void addPurchase(int... purchaseNumbers) {
        Integer [] integerArray = IntStream.of(purchaseNumbers).boxed().toArray(Integer []::new);
        Collections.addAll(purchases, integerArray);
    }
    public ArrayList getPurchases() {
        return basket.getPurchases();
    }
}
