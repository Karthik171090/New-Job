package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium9.30Batch\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement txtFirstName = driver.findElement(By.id("firstName"));
		txtFirstName.sendKeys("Karthik");
		WebElement txtLastName = driver.findElement(By.id("lastName"));
		txtLastName.sendKeys("S");
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("karthik1111111710");
		WebElement txtPass1 = driver.findElement(By.name("Passwd"));
		txtPass1.sendKeys("killer@123");
		WebElement txtPass2 = driver.findElement(By.name("ConfirmPasswd"));
		txtPass2.sendKeys("killer@123");
		WebElement btnNext = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		btnNext.click();
		Thread.sleep(3000);
		WebElement txtPhNo = driver.findElement(By.id("phoneNumberId"));
		txtPhNo.sendKeys("9098383930");
		
	}
	
}
