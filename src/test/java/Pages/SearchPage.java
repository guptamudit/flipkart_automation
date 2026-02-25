package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.BaseClass.Library;
import com.flipkart.ReusableFunctions.SeleniumReusable;

public class SearchPage extends Library {

    SeleniumReusable sr;

    public SearchPage(WebDriver driver) {
        Library.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/header/div[1]/div[2]/a/div/div/input")
    WebElement Searchtext;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div[2]/div/div/div[1]/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div")
    WebElement Logo;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/div/section/div[3]/div/a")
    WebElement resultPage;

    public void search(String text) {

        sr = new SeleniumReusable(driver);
        sr.enterValue(Searchtext, text);
    }

    public void clickSearch() {
        Searchtext.sendKeys(
                Keys.ENTER);
    }

    public void onHomePage() {
        System.out.println(Logo.isDisplayed());
    }

    public void onSearchResultPage() {
        System.out.println(resultPage.isDisplayed());
        System.out.println(driver.getTitle());
    }
}
