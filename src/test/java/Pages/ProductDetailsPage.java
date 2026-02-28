package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.BaseClass.Library;
import com.flipkart.ReusableFunctions.SeleniumReusable;

public class ProductDetailsPage extends Library {

    SeleniumReusable sr;

    public ProductDetailsPage(WebDriver driver) {
        Library.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='container']/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[3]/div/div/div/div/div/div/div/div/div[1]/div")
    WebElement productElement;

    public String ProdName() {
        return sr.getText(productElement);
    }

}
