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

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[15]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div[1]/div")
    WebElement addCarElement;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]")
    WebElement sizElement;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div[3]/div/div/div[1]/div")
    WebElement continuElement;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/header/div[3]/div[4]/div/a/div/img")
    WebElement cartLogoElement;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div[1]")
    WebElement insideCartProductNaElement;

    public String ProdName() {
        return sr.getText(productElement);
    }

    public void addtoCart() {
        sr.click(addCarElement);
    }

    public void selectSize() {
        sr.click(sizElement);
        sr.click(continuElement);
    }

    public void gotToCart() {
        sr.click(cartLogoElement);
    }

    public String checkProdinCart() {
        return sr.getText(insideCartProductNaElement);
    }

}
