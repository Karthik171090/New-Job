package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium9.30Batch\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/trains");
	WebElement txtFrom = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	txtFrom.sendKeys("Chennai");
	WebElement txtTo = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	txtTo.sendKeys("Kerala");
	WebElement btnSearch = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
	btnSearch.click();
		
	}
}
