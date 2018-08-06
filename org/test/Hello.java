package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "F:\\programs\\Browser\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		// url
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='gb_ed gb_Bd']")).click();
		driver.findElement(By.xpath("//a[@class='gb_b gb_hc']")).click();
		
		driver.findElement(By.xpath("(//span[@class='gb_2'])[7]")).click();
		
		
		
		
		
		
		
		
		
		/*driver.manage().window().maximize();
		WebElement txtUser = driver.findElement(By.id("login1"));
		txtUser.sendKeys("shyjdu3");
		WebElement txtPswd = driver.findElement(By.id("password"));
		txtPswd.sendKeys("yhju54");
		WebElement btnGo = driver.findElement(By.xpath("//input[@title='Sign in']"));
		
	Alert al = driver.switchTo().alert();
	al.accept();*/
	}

}
