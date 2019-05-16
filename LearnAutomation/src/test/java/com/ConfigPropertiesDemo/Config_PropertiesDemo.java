package com.ConfigPropertiesDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Config_PropertiesDemo 
{
	public static Properties prop;
	public static InputStream  i1;

	public Config_PropertiesDemo()
	{

		try 
		{
			prop = new Properties();
			String file_path = "C:\\Users\\guddigerekempaiaht\\git\\repository\\LearnAutomation\\config1.properties";
			File file = new File(file_path);
			i1 = new FileInputStream(file);
			prop.load(i1);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
