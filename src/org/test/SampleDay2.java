package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleDay2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium9.30Batch\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/ ");
		WebElement txtSource = driver.findElement(By.id("src"));
		txtSource.sendKeys("Chennai");
		WebElement txtDstn = driver.findElement(By.id("dest"));
		txtDstn.sendKeys("Bangalore");
		
		
	}
}
