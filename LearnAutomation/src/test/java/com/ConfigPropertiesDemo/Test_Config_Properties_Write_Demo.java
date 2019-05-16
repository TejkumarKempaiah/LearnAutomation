package com.ConfigPropertiesDemo;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Config_Properties_Write_Demo {
	public static WebDriver driver;
	public static Properties prop;

	static {
		WebDriverManager.chromedriver().setup();
	}

	public static void main(String[] args) {
		openBrowser();
		launchApp();
		writeDateIntoFile();
		closeBrowser();
	}

	public static void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
	}

	public static void launchApp() {
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	}

	public static void writeDateIntoFile() {
		Config_Properties_Write_Demo c1 = new Config_Properties_Write_Demo();
	}

	public static void closeBrowser() {
		driver.close();
	}
}
