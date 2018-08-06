package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\programs\\Browser\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
		WebElement dDn=driver.findElement(By.id("dropdown_7"));
		Select s=new Select(dDn);
		List<WebElement> emp = s.getOptions();
		for(int  i=emp.size()-10;i<emp.size();i++){
			s.selectByIndex(i);
			String s1=emp.get(i).getText();
			System.out.println(s1);
		}
		
		
			
			
		
	}	
		
		
	}


