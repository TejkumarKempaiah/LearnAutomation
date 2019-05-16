package com.ConfigPropertiesDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Config_Properties_Write_Demo 
{
	public Config_Properties_Write_Demo() 
	{
		try {
			Properties prop = new Properties();
			String file_path = "C:\\Users\\guddigerekempaiaht\\git\\repository\\LearnAutomation\\config2.properties";
			File file = new File(file_path);
			OutputStream o1 = new FileOutputStream(file);

			prop.setProperty("---Orange_HRM_Login Page Title---", "OrangeHRM");
			prop.save(o1, "LoginPage Title For OrangeHRM Application");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

}
