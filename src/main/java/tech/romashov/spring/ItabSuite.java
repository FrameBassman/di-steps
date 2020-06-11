package tech.romashov.spring;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tech.romashov.guice.DiscountTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        DiscountTest.class,
})
public class ItabSuite {
}
