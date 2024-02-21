package hu.ibello.ui.pages;

import hu.ibello.core.Name;
import hu.ibello.elements.WebElement;
import hu.ibello.search.By;
import hu.ibello.search.Find;
import hu.ibello.search.Relation;
import hu.ibello.search.RelationType;

@Name("Home page")
public class HomePage extends AbstractPage {

    private static final String url = "";

    @Find(by = By.CSS_SELECTOR, using = "welcome-image-lane")
    private WebElement mainLane;

    @Find(by = By.TEXT, using = "${0}")
    @Relation(type = RelationType.DESCENDANT_OF, by = By.CSS_SELECTOR, using = "welcome-image-lane")
    private WebElement text;

    @Override
    public void I_am_on_the_page() {
        expect_url_is_$(url);
        expectations().expect(mainLane).toBe().displayed();
    }

    public void assume_$_text_is_displayed(String textToCheck) {
        expectations().assume(text.applyParameters(textToCheck)).toBe().displayed();
    }

    public void assume_$_text_is_not_displayed(String textToCheck) {
        expectations().assume(text.applyParameters(textToCheck)).toNotBe().displayed();
    }

    public void I_open_homepage() {
        browser().resize(2000, 1000);
        browser().maximize();
        browser().openURL("/home?client=test");
    }
}
