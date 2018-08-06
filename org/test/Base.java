package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver getDriver(String url) {
		System.setProperty("webdriver.chrome.driver", "F:\\programs\\Browser\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		return driver;
	}
	public static boolean verifyHidden(WebElement element) {
		boolean b = element.isDisplayed();
		return b;
	}
	public static boolean verifyTextBoxAndButtonEnable(WebElement element) {
		boolean b = element.isEnabled();
		return b;
		}
	public static void type(WebElement element, String name) {
		if(verifyHidden(element) && (verifyTextBoxAndButtonEnable(element))){
			element.sendKeys(name);
			
		}
	}
		public static void btnclick(WebElement element) {
			if(verifyHidden(element) && (verifyTextBoxAndButtonEnable(element))){
				element.click();
			}

	}
	
		
		

}
