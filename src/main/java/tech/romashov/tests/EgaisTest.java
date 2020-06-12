package tech.romashov.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.romashov.SpringJUnitRunner;
import tech.romashov.steps.BaseSteps;
import tech.romashov.steps.EgaisSteps;

import java.math.BigDecimal;

@RunWith(SpringJUnitRunner.class)
@Component
public class EgaisTest {

    @Autowired
    private BaseSteps baseSteps;

    @Autowired
    private EgaisSteps egaisSteps;

    @Test
    public void ScanAlco() throws Exception {
        String product = "alco";
        BigDecimal price = BigDecimal.valueOf(4);

        baseSteps.addProduct(product, price);
        egaisSteps.scanMark();
        baseSteps.finishPurchase(product, price);
    }
}
