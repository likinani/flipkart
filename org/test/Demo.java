package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\programs\\Browser\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		WebElement firstName=driver.findElement(By.name("firstname"));
		firstName.sendKeys("jana");
		WebElement lastName=driver.findElement(By.name("lastname"));
		lastName.sendKeys("145");
		WebElement gender=driver.findElement(By.xpath("//input[@value='Female']"));
		gender.click();
		WebElement xps=driver.findElement(By.xpath("//input[@value='2']"));
		xps.click();
		WebElement date=driver.findElement(By.id("datepicker"));
		date.sendKeys("11/12/18");
		WebElement profession=driver.findElement(By.xpath("//input[@value='Manual Tester']"));
		profession.click();
		WebElement tools=driver.findElement(By.xpath("//input[@value='QTP']"));
		tools.click();
		WebElement country=driver.findElement(By.id("continents"));
		Select s=new Select(country);
		s.selectByIndex(2);
		WebElement commands=driver.findElement(By.id("selenium_commands"));
		Select s1=new Select(commands);
		s1.selectByVisibleText("Navigation Commands");
		WebElement submit=driver.findElement(By.id("submit"));
		submit.click();
		
		
	
		
		
	}

}
