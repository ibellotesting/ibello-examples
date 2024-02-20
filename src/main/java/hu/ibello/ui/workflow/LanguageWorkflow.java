package hu.ibello.ui.workflow;

import hu.ibello.core.Name;
import hu.ibello.ui.model.LanguageSelection;
import hu.ibello.ui.steps.LanguageSteps;
import hu.ibello.ui.steps.NavigationSteps;
import hu.ibello.steps.StepLibrary;

@Name("Language")
public class LanguageWorkflow extends StepLibrary{

    private NavigationSteps navigationSteps;
    private LanguageSteps languageSteps;

    public void i_am_on_homepage() {
        navigationSteps.I_open_the_homepage();
    }

    public void the_current_language_is_the_default() {
        LanguageSelection data = testData().fromJson(LanguageSelection.class).load();
        languageSteps.based_on_$_test_data__i_check_if_the_language_is_default(data);
    }

    public void i_select_the_language() {
        LanguageSelection data = testData().fromJson(LanguageSelection.class).load();
        languageSteps.based_on_$_test_data__i_select_other_language(data);
    }

    public void language_is_changed() {
        LanguageSelection data = testData().fromJson(LanguageSelection.class).load();
        languageSteps.based_on_$_test_data__i_check_if_the_language_is_changed(data);
    }

    public void i_change_the_language_back_to_default() {
        LanguageSelection data = testData().fromJson(LanguageSelection.class).load();
        languageSteps.based_on_$_test_data__i_select_the_default_language(data);
    }

}
