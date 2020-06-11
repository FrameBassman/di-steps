package tech.romashov.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.romashov.steps.BaseSteps;
import tech.romashov.steps.DiscountSteps;

@RunWith(SpringJUnitRunner.class)
@Component
public class DiscountTest {

    @Autowired
    private BaseSteps baseSteps;

    @Autowired
    private DiscountSteps discountSteps;

    @Test
    public void SimpleTest() {
        baseSteps.loadCash();
        baseSteps.addProduct();
        discountSteps.applyDiscount();
        baseSteps.finishPurchase();
    }
}
