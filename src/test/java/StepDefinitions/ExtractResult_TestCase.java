package StepDefinitions;

import java.io.IOException;

import com.flipkart.BaseClass.Library;

import Pages.SearchPage;
import Pages.SearchResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExtractResult_TestCase extends Library {

    SearchPage sp;
    SearchResultPage srp;

    // --- Background Steps ---

    @Given("Launch the flipkart application")
    public void launchApp() throws IOException {
        launchApplication();
    }

    @When("Close the popup")
    public void closePopup() {
        sp = new SearchPage(driver);
        sp.closePopUp();
    }

    @Then("it should navigate to the home page")
    public void verifyHomePage() {
        sp.onHomePage();
    }

    // --- Scenario Steps ---

    @Given("user enter text in the search box")
    public void enterSearchText() {
        sp.search("Mobile");
    }

    @When("click on the search button")
    public void clickSearch() {
        sp.clickSearch();
    }

    @Then("It should navigate to the search result page and display the relevant products")
    public void verifyResults() {
        sp.onSearchResultPage();
    }

    @When("user click on the first product")
    public void clickFirstProduct() {
        srp = new SearchResultPage(driver);
        srp.clickOnProduct();
        srp.goToProductHandle();
    }

    @Then("extract the product name and price")
    public void extractDetails() {
        System.out.println("Product Name : " + srp.getProductName());
        System.out.println("Product Description : " + srp.getProductDesc());
        System.out.println("Product Price : " + srp.getProductPrice());
    }
}
