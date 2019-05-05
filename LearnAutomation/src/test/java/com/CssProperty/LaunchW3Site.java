package com.CssProperty;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import com.Utility.RetrieveCssProperty;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchW3Site {
	public static WebDriver driver;
	static {
		WebDriverManager.chromedriver().setup();
	}

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();

		driver.get("https://www.w3schools.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// locate the webelement
		WebElement examples = driver.findElement(By.id("navbtn_examples"));
		RetrieveCssProperty.getCssProperties(examples);

		driver.close();

	}

}
