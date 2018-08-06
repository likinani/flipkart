package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base1 {

		public static WebDriver getDriver(String url) {
			System.setProperty("webdriver.chrome.driver", "F:\\programs\\Browser\\Drivers\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get(url);
			return driver;
		}
		

		
		public static void type(WebElement element, String name) {
			element.sendKeys(name);
		}

		
		public static void btnClick(WebElement e1) {
		e1.click();

}
}
