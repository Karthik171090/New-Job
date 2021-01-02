package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium9.30Batch\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ ");
//		WebElement btnSearch = driver.findElement(By.xpath("//form[@name='site-search']"));
//		btnSearch.click();
//		WebElement txtSearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//		txtSearch.sendKeys("iPhone");
//		WebElement btnGo = driver.findElement(By.xpath("//input[@value='Go']"));
//		btnGo.click();
		WebElement btnPrime = driver.findElement(By.xpath("//span[text()='Prime']"));
		Actions a=new Actions(driver);
		a.moveToElement(btnPrime).perform();
		Thread.sleep(3000);
		WebElement btnFastDelivery = driver.findElement(By.id("multiasins-img-link"));
		btnFastDelivery.click();
	}
}
