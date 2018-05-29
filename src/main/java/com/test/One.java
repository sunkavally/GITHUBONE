package com.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class One {
	@Test
	public void test() throws InterruptedException {
		String path = "chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(7000);
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("mercury");
		System.out.println(":  Entered 'mercury' in UserName Field");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("mercury");
		System.out.println(":  Entered Password");
		driver.findElement(By.name("login")).click();
		System.out.println(":  Clicked on Login Button");
		driver.quit();
	}

}
