package hu.ibello.api.steps;

import hu.ibello.api.assertions.Assertions;
import hu.ibello.core.TestException;
import hu.ibello.steps.StepLibrary;

public class AbstractSteps extends StepLibrary {

    private Assertions assertions;

    protected void shouldNotBeNull(Object value, String error) {
        if (value == null) {
            throw new TestException(error);
        }
    }

    protected Assertions assertions() {
        if (assertions == null) {
            assertions = new Assertions();
        }
        return assertions;
    }
}
