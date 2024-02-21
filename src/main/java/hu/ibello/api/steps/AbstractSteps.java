package hu.ibello.api.steps;

import hu.ibello.api.assertions.Assertions;
import hu.ibello.steps.StepLibrary;

public class AbstractSteps extends StepLibrary {

    private Assertions assertions;

    protected Assertions assertions() {
        if (assertions == null) {
            assertions = new Assertions();
        }
        return assertions;
    }
}
