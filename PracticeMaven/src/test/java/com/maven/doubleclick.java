package com.maven;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class doubleclick {
	WebDriver driver;
	@BeforeMethod
	public void Initalization() {
	 driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		driver.manage().window().maximize(); // Maximize the browser

		System.out.println(driver.getTitle());

	}

	@Test
	public void Double() throws InterruptedException {
		// TODO Auto-generated method stub

		WebElement driver1 = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act3 = new Actions(driver);
		act3.doubleClick(driver1).perform();

		Thread.sleep(2000);
		Alert alrt = driver.switchTo().alert();

		System.out.println(alrt.getText());
		// Thread.sleep(2000);
		alrt.accept();

		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		act3.contextClick(rightclick).perform();// Can't inspect Right click

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Edit']")).click();

		

	}

	@Test

	public void drag() throws InterruptedException {

		
		WebElement Sp = driver.findElement(By.xpath("//a[text()=' BANK ']"));

		WebElement Target = driver.findElement(By.id("bank"));

		Actions act = new Actions(driver);

		act.dragAndDrop(Sp, Target).perform();

		Thread.sleep(3000);
		WebElement Sp1 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement Target1 = driver.findElement(By.id("loan"));
		act.dragAndDrop(Sp1, Target1).perform();

		Thread.sleep(3000);

		WebElement Sp2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement Target2 = driver.findElement(By.id("amt8"));
		act.dragAndDrop(Sp2, Target2).perform();
		
	}
	
	@AfterMethod
	public void Cleanup()
	{
		driver.quit();
	
	
	}
	
	
	
	
}


