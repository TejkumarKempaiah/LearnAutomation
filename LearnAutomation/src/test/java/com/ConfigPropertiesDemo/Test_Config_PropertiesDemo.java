package com.ConfigPropertiesDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Config_PropertiesDemo 
{
	public static WebDriver driver;
	public static WebElement username;
	public static WebElement password;
	public static WebElement loginButton;
	public static String home_page_url;
	
	static 
	{
		WebDriverManager.chromedriver().setup();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		openBrowser();
		launchApp();
		login_to_orangeHRM();
		verifyLogin();
		displayHomePageURL();
		closeBrowser();
	}
	
	public static void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
	}
	
	public static void launchApp()
	{
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	}
	
	public static void login_to_orangeHRM() throws InterruptedException
	{
		username = driver.findElement(By.id("txtUsername"));
		password = driver.findElement(By.id("txtPassword"));
		loginButton = driver.findElement(By.id("btnLogin"));
		
		//Create an object for the config properties class
		Config_PropertiesDemo c1 = new Config_PropertiesDemo();
		
		username.sendKeys(c1.prop.getProperty("username")); Thread.sleep(2000);
		password.sendKeys(c1.prop.getProperty("password")); Thread.sleep(2000);
		loginButton.click();	
	}
	
	public static void verifyLogin()
	{
		home_page_url = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		
		if (home_page_url.contains("dashboard"))
		{
			System.out.println("login pass");
		} 
		else
		{
			System.out.println("login fail");
		}

	}
	
	public static void displayHomePageURL()
	{
		System.out.println("Home page url = "+driver.getCurrentUrl());
	}
	
	public static void closeBrowser()
	{
		driver.close();
	}
	
}
