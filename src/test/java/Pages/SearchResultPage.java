package Pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.BaseClass.Library;
import com.flipkart.ReusableFunctions.SeleniumReusable;

public class SearchResultPage extends Library {

    SeleniumReusable sr;

    public SearchResultPage(WebDriver driver) {
        Library.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img")
    WebElement FirstResult;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div/div[1]/div")
    WebElement productName;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div/div")
    WebElement productDescription;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[4]/div/div/div/div/div/div/div/div/div/div/div/a/div/div[3]/div")
    WebElement ProdPrice;

    public void clickOnProduct() {
        sr = new SeleniumReusable(driver);
        sr.click(FirstResult);
    }

    public void goToProductHandle() {
        String currentHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String handle : allWindowHandles) {
            if (!handle.equals(currentHandle)) {
                driver.switchTo().window(handle);
            }
        }
    }

    public String getProductName() {
        return sr.getText(productName);
    }

    public String getProductDesc() {
        return sr.getText(productDescription);
    }

    public String getProductPrice() {
        return sr.getText(ProdPrice);
    }
}
