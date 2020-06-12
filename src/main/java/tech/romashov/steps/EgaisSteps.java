package tech.romashov.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tech.romashov.core.TestContext;

@Service
@Component
public class EgaisSteps {
    @Autowired
    private TestContext context;

    public void scanMark() {
        System.out.println("Scan mark");
    }
}
