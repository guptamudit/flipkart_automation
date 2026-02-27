package com.flipkart.ReusableFunctions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.flipkart.BaseClass.Library;

public class SeleniumReusable extends Library {
    public SeleniumReusable(WebDriver driver) {
        Library.driver = driver;
    }

    // Enter text on the page
    public void enterValue(WebElement element, String text) {
        try {
            element.sendKeys(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // click element on the page
    public void click(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    // get the title from the page
    public void getTitle() {
        try {
            System.out.println(driver.getTitle());
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    // take a screenshot
    public void takeScreenshot(String path) {
        TakesScreenshot TS = (TakesScreenshot) driver;
        File source = TS.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(source, new File(path));
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    // get text from page
    public String getText(WebElement element) {
        return element.getText();
    }

    // hover over an element
    public void hover(WebElement element) {
        try {
            Actions ac = new Actions(driver);
            ac.moveToElement(element).perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
