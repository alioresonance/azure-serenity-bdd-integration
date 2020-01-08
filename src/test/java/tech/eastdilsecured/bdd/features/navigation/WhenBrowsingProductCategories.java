package tech.eastdilsecured.bdd.features.navigation;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import tech.eastdilsecured.bdd.model.Category;
import tech.eastdilsecured.bdd.steps.NavigatingUser;

@RunWith(SerenityRunner.class)
public class WhenBrowsingProductCategories {

    @Steps
    NavigatingUser john;

    @Managed  // this injects the driver into the PageObject
    WebDriver driver;

    @Test
    public void shouldBeAbleToNavigateToTheMotorsCategory() {
        // Given
        john.isOnTheHomePage();

        // When
        john.navigatesToCategory(Category.Motors);

        // Then
        john.shouldSeePageTitleContaining("New & used cars");
    }
}
