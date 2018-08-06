package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Example extends Base {
	public static void main(String[] args) throws InterruptedException {
		/*WebDriver driver=getDriver("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtUserName =driver.findElement(By.id("email"));
		type(txtUserName,"JAVA");
		WebElement txtPassword =driver.findElement(By.id("pass"));
		type(txtPassword,"Greens");
		WebElement btnLogin =driver.findElement(By.xpath("//input[@type='submit']"));
		btnclick(btnLogin);*/
		WebDriver driver=getDriver("https://www.gettyimages.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Sign in'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='REGISTER]")).click();
		

		
	}


		
	

	
		
	}

