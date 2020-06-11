package tech.romashov.guice;

import com.google.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import tech.romashov.guice.GuiceJUnitRunner.GuiceModules;
import tech.romashov.steps.BaseSteps;
import tech.romashov.steps.DiscountSteps;

@RunWith(GuiceJUnitRunner.class)
@GuiceModules({ })
public class DiscountTest {

    private BaseSteps baseSteps;
    private DiscountSteps discountSteps;

    @Inject
    public void setDiscountSteps(DiscountSteps steps) {
        discountSteps = steps;
    }

    @Inject
    public void setBaseSteps(BaseSteps steps) {
        baseSteps = steps;
    }

    @Test
    public void SimpleTest() {
        baseSteps.loadCash();
        baseSteps.addProduct();
        discountSteps.applyDiscount();
        baseSteps.finishPurchase();
    }
}
