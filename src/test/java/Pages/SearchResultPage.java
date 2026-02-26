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

    public void clickOnProduct() {
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
}
