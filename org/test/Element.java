package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Element {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\programs\\Browser\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		WebElement commands=driver.findElement(By.id("selenium_commands"));
		Select s=new Select(commands);
		List<WebElement> emp = s.getOptions();
		for(int i=0;i<emp.size();i++){
			if(i%2==0 ){
				String d = emp.get(i).getText();
			
				s.selectByVisibleText(d);
		System.out.println(d);
		}
	
		}
		
	}

}
