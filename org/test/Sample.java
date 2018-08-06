package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.sun.glass.events.KeyEvent;




public class Sample {
	public static void main(String[] args) throws InterruptedException {
		// config the driver

		System.setProperty("webdriver.chrome.driver", "F:\\programs\\Browser\\Drivers\\chromedriver.exe");
		// launch browser
		WebDriver driver = new ChromeDriver();
		// url
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		WebElement btnGo = driver.findElement(By.name("proceed"));
		Alert al = driver.switchTo().alert();
		al.accept();
		
		/*driver.get("http://demoqa.com/registration/");
		driver.manage().window().maximize();
		WebElement firstName = driver.findElement(By.name("first_name"));
		firstName.sendKeys("dfhikh3782");
		String s = firstName.getAttribute("value");
		System.out.println(s);*/
		
		//WebElement country =driver.findElement(By.id("dropdown_7"));
		//Select s=new Select(country);
		//s.s
		//List<WebElement> emp = s.getOptions();
		//for(WebElement x:emp){
		//	System.out.println(x.getText());
	//for(int i=0;i<emp.size();i++){
		
		//System.out.println(emp.get(i).getAttribute("value"));
	}
			
}
		
		
		

		//WebElement googleApp = driver.findElement(By.className("gb_O"));
		//googleApp.click();
	

		
		
	
