package tech.romashov.spring;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJUnitRunner extends BlockJUnit4ClassRunner {
    AnnotationConfigApplicationContext context;

    /**
     * Creates a BlockJUnit4ClassRunner to run {@code klass}
     *
     * @param klass
     * @throws InitializationError if the test class is malformed.
     */
    public SpringJUnitRunner(Class<?> klass) throws InitializationError {
        super(klass);
        context = new AnnotationConfigApplicationContext();
        context.scan("tech.romashov");
        context.refresh();
    }

    @Override
    public Object createTest() throws Exception {
        Object obj = super.createTest();
        return context.getBean(obj.getClass());
    }
}
