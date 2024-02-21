package hu.ibello.ui.steps;

import hu.ibello.core.Name;
import hu.ibello.ui.pages.*;
import hu.ibello.steps.StepLibrary;

@Name("Navigation steps")
public class NavigationSteps extends StepLibrary {
    private HomePage homePage;

    public void I_open_the_homepage() {
        homePage.I_open_homepage();
        homePage.I_am_on_the_page();
    }

}
