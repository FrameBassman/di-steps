package tech.romashov.tests.suite;

import com.google.inject.Inject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import tech.romashov.GuiceJUnitRunner;
import tech.romashov.GuiceJUnitRunner.GuiceModules;
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
