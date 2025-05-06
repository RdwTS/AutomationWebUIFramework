package org.ridwan.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ridwan.BaseTest;
import org.ridwan.page.HomePage;
public class HomeStep extends BaseTest {

    HomePage homePage;


    @Then("user will be on homepage")
    @Given("user is on homepage")
    public void userIsOnHomepage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }

    @When("user clicks {string} button for Backpack")
    public void userClicksButtonFor(String buttonText) {
            homePage.clickAddToCartBackpack();
    }

    @Then("the button should change to {string}")
    public void theButtonShouldChangeTo(String buttonTextChangeRemove) {
            homePage.validateRemoveButtonVisible();
    }

    @And("cart count should increase by {int}")
    public void cartCountShouldIncreaseBy(int count) {
        homePage.validateCartCount(count);
    }


}
