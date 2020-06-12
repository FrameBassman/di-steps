package tech.romashov.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.romashov.SpringJUnitRunner;
import tech.romashov.steps.BaseSteps;
import tech.romashov.steps.DiscountSteps;

import java.math.BigDecimal;

@RunWith(SpringJUnitRunner.class)
@Component
public class DiscountTest {

    @Autowired
    private BaseSteps baseSteps;

    @Autowired
    private DiscountSteps discountSteps;

    @Test
    public void SimpleTest() {
        String product = "banana";
        BigDecimal originPrice = BigDecimal.valueOf(10);
        BigDecimal discount = BigDecimal.valueOf(0.9);
        BigDecimal priceWithDiscount = originPrice.multiply(discount);

        baseSteps.loadCash();
        baseSteps.addProduct(product, originPrice);
        discountSteps.applyDiscount(discount);
        baseSteps.finishPurchase(product, priceWithDiscount);
    }
}
