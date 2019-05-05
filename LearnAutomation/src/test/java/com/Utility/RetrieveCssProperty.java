package com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class RetrieveCssProperty 
{
	public static void getCssProperties(WebElement element) 
	{

		// retrieve the cssValue of the webelement
		String color = element.getCssValue("color");
		String background_color = element.getCssValue("background-color");
		String font_size = element.getCssValue("font-size");
		String font_family = element.getCssValue("font-family");
		String text_aligin = element.getCssValue("text-align");

		System.out.println("color = " + color);
		System.out.println("background_color = " + background_color);
		System.out.println("font_size = " + font_size);
		System.out.println("font_family = " + font_family);
		System.out.println("text_aligin = " + text_aligin);

		System.out.println("Color and Background-Color is hex format");

		String color_in_hex_format = Color.fromString(color).asHex();
		String background_color_in_hex_format = Color.fromString(background_color).asHex();

		System.out.println("color_in_hex_format = " + color_in_hex_format);
		System.out.println("background_color_in_hex_format = " + background_color_in_hex_format);

	}
}
