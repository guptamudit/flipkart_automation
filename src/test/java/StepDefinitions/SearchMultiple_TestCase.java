package StepDefinitions;

import java.io.IOException;

import com.flipkart.BaseClass.Library;
import com.flipkart.ReusableFunctions.SeleniumReusable;

import Pages.SearchPage;
import Pages.SearchResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchMultiple_TestCase extends Library {

    SearchPage sp;
    SearchResultPage srp;
    SeleniumReusable sr;

    @Given("Launch the flipkart application")
    public void launch_the_flipkart_application() throws IOException {
        launchApplication();
    }

    @When("Close the popup")
    public void close_the_popup() {
        sp = new SearchPage(driver);
        sp.closePopUp();
    }

    @Then("it should navigate to the home page")
    public void it_should_navigate_to_the_home_page() {
        sp.onHomePage();
    }

    @Given("user enter {string} in the search box")
    public void user_enter_in_the_search_box(String product) {
        sp.search(product);
    }

    @When("click on the search button")
    public void click_on_the_search_button() {
        sp.clickSearch();
    }

    @Then("It should navigate to the search result page and display the relevant products")
    public void verify_search_result_page() {
        sp.onSearchResultPage();
    }

    @And("a screenshot of the page is taken and stored in the specified {string}")
    public void take_screenshot(String path) throws IOException {
        sr = new SeleniumReusable(driver);
        sr.takeScreenshot(path);
    }
}
