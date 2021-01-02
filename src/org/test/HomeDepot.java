package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium9.30Batch\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.homedepot.com/");
		Actions a=new Actions(driver);
		WebElement btnAllDept = driver.findElement(By.xpath("//a[text()='All Departments']"));
				a.moveToElement(btnAllDept).perform();
		WebElement btnHeat = driver.findElement(By.xpath("//a[text()='Heating & Cooling']"));
	a.moveToElement(btnHeat).perform();
	WebElement btnAir = driver.findElement(By.xpath("//a[text()='Air Conditioners']"));
	a.moveToElement(btnAir).perform();
	WebElement btnPort = driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
	btnPort.click();
	}
	
	
}
