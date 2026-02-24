package com.flipkart.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {

	public static WebDriver driver;
	public static Properties prop;

	public void launchApplication() throws IOException {
		FileInputStream input = new FileInputStream(
				"/Flipkart_Automation/src/test/resources/Properties/Config.Property");
		prop = new Properties();
		prop.load(input);

		try {
			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--incognito");
				driver = new ChromeDriver(options);
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(prop.getProperty("url"));
		} catch (Exception e) {
			System.out.println("Browser not launched");
		}
	}

	public void teardown() {
		driver.close();
	}

}