package hu.ibello.ui.panel;

import hu.ibello.core.Name;
import hu.ibello.elements.WebElement;
import hu.ibello.pages.PageObject;
import hu.ibello.search.By;
import hu.ibello.search.Find;
import hu.ibello.search.Relation;
import hu.ibello.search.RelationType;

@Name("Navigation bar panel")
public class NavigationBarPanel extends PageObject {

    @Find(by = By.BUTTON_TEXT, using = "▼")
    private WebElement languageLink;

    @Find(by = By.CSS_SELECTOR, using = "a[title='magyar']")
    @Relation(type = RelationType.DESCENDANT_OF, by = By.ID, using = "language-selector")
    private WebElement hungarianLink;

    @Find(by = By.CSS_SELECTOR, using = "a[title='english']")
    @Relation(type = RelationType.DESCENDANT_OF, by = By.ID, using = "language-selector")
    private WebElement englishLink;

    public void click_language_link() {
        doWith(languageLink).click();
    }

    public void click_hungarian_link() {
        doWith(hungarianLink).withPageRefreshWait().click();
    }

    public void click_english_link() {
        doWith(englishLink).withPageRefreshWait().click();
    }

}
