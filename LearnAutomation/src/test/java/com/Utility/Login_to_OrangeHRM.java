package com.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_to_OrangeHRM {
	public static WebDriver driver;
	static {
		WebDriverManager.chromedriver().setup();
	}

	public static void main(String[] args) throws InterruptedException {
		openBrowser();
		launchApp();
		login_to_orangeHRM();
		logout();
		closeBrowser();

	}

	public static void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
	}

	public static void launchApp() {
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	}

	public static void login_to_orangeHRM() throws InterruptedException {

		// enter username
		driver.findElement(By.id("txtUsername")).sendKeys("admin1");

		// enter password
		driver.findElement(By.id("txtPassword")).sendKeys("waSukYx!N3y+X@J3");

		// click on login button
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);

		// verify if login is successful or not, If not then take screenshot
		String home_page_url = driver.getCurrentUrl();

		if (home_page_url.contains("dashboard")) {
			System.out.println("login pass");
		} else {
			System.out.println("login fail");
			Utility_TakeScreenShot.takeScreenTej("orangeHRM_loginpage", driver);
		}

	}

	public static void logout() throws InterruptedException {
		// click on user profile
		WebElement user_profile = driver.findElement(By.id("welcome"));
		user_profile.click();
		Thread.sleep(1000);

		// click on logout
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);
	}

	public static void closeBrowser() {
		driver.close();
	}
}
