package StepDefinitions;

import java.io.IOException;

import com.flipkart.BaseClass.Library;

import Pages.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchMobile_TestCase extends Library {

    SearchPage sp;

    // --- Background Steps ---

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

    // --- Scenario Steps ---

    @Given("user enter text in the search box")
    public void user_enter_text_in_the_search_box() {
        sp.search("Mobile");
    }

    @When("click on the search button")
    public void click_on_the_search_button() {
        sp.clickSearch();
    }

    @Then("It should navigate to the search result page and display the relevant products")
    public void it_should_navigate_to_the_search_result_page_and_display_the_relevant_products() {
        sp.onSearchResultPage();
    }
}
