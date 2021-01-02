package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium9.30Batch\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		WebElement btnClick = driver.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
		btnClick.click();
		WebElement btnClick2 = driver.findElement(By.className("toparrowhead-sign"));
		btnClick2.click();
	}
}
