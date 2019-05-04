package com.Utility;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility_TakeScreenShot {

	public static void takeScreenTej(String filename, WebDriver _driver) {

		try {
			File src_file = ((TakesScreenshot) _driver).getScreenshotAs(OutputType.FILE);

			String project_path = System.getProperty("user.dir");
			System.out.println("project_path = " + project_path);

			String dst_file_path = project_path + "\\failed_testcases\\" + "_" + filename + "_"
					+ System.currentTimeMillis() + ".png";

			// dst file creation
			File dst_file = new File(dst_file_path);

			// copy src_file screen shot into dst_file
			FileUtils.copyFile(src_file, dst_file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
