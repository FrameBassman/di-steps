package tech.romashov.steps;

import org.hamcrest.MatcherAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tech.romashov.spring.TestContext;

import java.math.BigDecimal;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.closeTo;

@Service
@Component
public class BaseSteps {
    @Autowired
    private TestContext context;

    public void loadCash() {
        System.out.println("Load cash");
    }

    public void addProduct(String product, BigDecimal originPrice) {
        context.product = product;
        context.price = originPrice;
    }

    public void finishPurchase(String product, BigDecimal priceWithDiscount) {
        MatcherAssert.assertThat(context.product, equalTo(product));
        MatcherAssert.assertThat(context.price, closeTo(priceWithDiscount, BigDecimal.valueOf(0)));
    }
}
