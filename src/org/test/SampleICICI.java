package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleICICI {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium9.30Batch\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		WebElement txtUser = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		txtUser.sendKeys("Sairam");
		WebElement txtPass = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		txtPass.sendKeys("123456");
	}
}
