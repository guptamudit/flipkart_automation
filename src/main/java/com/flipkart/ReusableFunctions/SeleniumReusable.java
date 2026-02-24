package com.flipkart.ReusableFunctions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.flipkart.BaseClass.Library;



public class SeleniumReusable extends Library {
	public SeleniumReusable(WebDriver driver) {
		this.driver = driver;
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// get the title from the page
	public void getTitle() {
		try {
			System.out.println(driver.getTitle());
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
