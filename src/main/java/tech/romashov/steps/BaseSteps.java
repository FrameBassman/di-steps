package tech.romashov.steps;

import org.springframework.stereotype.Service;

@Service
public class BaseSteps {
    public void loadCash() {
        System.out.println("Load cash");
    }

    public void addProduct() {
        System.out.println("Add product");
    }

    public void finishPurchase() {
        System.out.println("Finish purchase");
    }
}
