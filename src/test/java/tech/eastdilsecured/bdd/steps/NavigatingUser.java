package tech.eastdilsecured.bdd.steps;

import tech.eastdilsecured.bdd.model.Category;
import tech.eastdilsecured.bdd.ui.CurrentPage;
import tech.eastdilsecured.bdd.ui.EbayHomePage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class NavigatingUser {

    EbayHomePage ebayHomePage;
    CurrentPage currentPage;

    @Step
    public void isOnTheHomePage() {
        ebayHomePage.open();
    }

    @Step
    public void navigatesToCategory(Category category) {

    }

    @Step
    public void shouldSeePageTitleContaining(String expectedTitle) {
        assertThat(currentPage().getTitle()).isEqualTo( expectedTitle );
    }

}
