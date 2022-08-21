package com.flightofdream.purchasesBasket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RequestMapping("/store/order")
@RestController
public class BasketServiceController {

    private final BasketService basketService;
    public BasketServiceController(BasketService basketService) {
        this.basketService=basketService;
    }
    @GetMapping(path="/add")
    public String addPurchase(@RequestParam("pn") int... purchaseNumbers) {
        basketService.addPurchase(purchaseNumbers);
        return "Данные успешно добавлены!";
    }
    @GetMapping(path="/get")
    public ArrayList<Integer> getPurchase() {
        return basketService.getPurchases();
    }
}
