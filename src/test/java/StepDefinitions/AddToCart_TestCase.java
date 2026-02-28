package StepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.flipkart.BaseClass.Library;

import Pages.ProductDetailsPage;
import Pages.SearchPage;
import Pages.SearchResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart_TestCase extends Library {
    SearchPage sp;
    SearchResultPage srp;
    ProductDetailsPage pd;
    String ProductName;
    String ProdDetailsPageProdName;
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

    // --- Scenario: To validate the extract result functionality ---

    @Given("user enter text in the search box")
    public void user_enter_text_in_the_search_box() {
        sp.search("t-shirt");
    }

    @When("click on the search button")
    public void click_on_the_search_button() {
        sp.clickSearch();
    }

    @Then("It should navigate to the search result page and display the relevant products")
    public void it_should_navigate_to_the_search_result_page_and_display_the_relevant_products() {
        sp.onSearchResultPage();
    }

    @And("user select a product from the search result page")
    public void user_select_a_product_from_the_search_result_page() {
        srp = new SearchResultPage(driver);
        ProductName = srp.getFirstProdName();
        srp.clickOnProduct();
        srp.goToProductHandle();
    }

    @Then("It should navigate to the product details page")
    public void it_should_navigate_to_the_product_details_page() {
        ProdDetailsPageProdName = pd.ProdName();
        Assert.assertEquals(ProductName, ProdDetailsPageProdName);
    }

    @And("user click on the add to cart button")
    public void user_click_on_the_add_to_cart_button() {
        pd.addtoCart();
    }

    @And("select the size of the product")
    public void select_the_size_of_the_product() {
        pd.selectSize();
        pd.gotToCart();
    }

    @Then("It should add the product to the cart")
    public void it_should_add_the_product_to_the_cart() {
        Assert.assertTrue(pd.checkProdinCart().contains(ProdDetailsPageProdName));
    }
}
