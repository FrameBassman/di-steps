package tech.romashov.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tech.romashov.spring.TestContext;

import java.math.BigDecimal;

@Service
@Component
public class DiscountSteps {

    @Autowired
    private TestContext context;

    public void applyDiscount(BigDecimal discount) {
        context.price = context.price.multiply(discount);
    }
}
