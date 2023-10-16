package com.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class VariousTests {
	
	@Test(priority=1)
	public void Livecareer() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.livecareer.com/dashboard");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//button[text()='Accept All']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("widget-user-email")).sendKeys("ij.virdi16@gmail.com");
		driver.findElement(By.id("widget-user-password")).sendKeys("25@Modesto");
		driver.findElement(By.id("btnSignIn")).click();
		Thread.sleep(4000);
		
		//Mouse Hovering
		WebElement Inderjeet = driver.findElement(By.xpath("(//span[text()='Inderjeet'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(Inderjeet).perform();

		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Settings']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("liResumes2")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Edit'])[2]")).click();
		
		
		
		
		
		driver.quit();

	}
	
	@Test(priority=2)
	public void Facebook() throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.getTitle();

		driver.findElement(By.id("email")).sendKeys("inderjeet");
		driver.findElement(By.id("pass")).sendKeys("virdi");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(8000);
		driver.quit();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
