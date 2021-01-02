package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium9.30Batch\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/ ");
		WebElement btnSignUp = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		btnSignUp.click();
		WebElement txtMob = driver.findElement(By.xpath("//input[@name='mobile']"));
		txtMob.sendKeys("1234566789");
		WebElement txtName = driver.findElement(By.xpath("//input[@id='name']"));
		txtName.sendKeys("Karthik");
		WebElement txtEmail = driver.findElement(By.xpath("//input[@type='email']"));
		txtEmail.sendKeys("killer@gmail.com");
		WebElement txtPass = driver.findElement(By.xpath("//input[@type='password']"));
		txtPass.sendKeys("killer");
		WebElement btnCont = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		btnCont.click();
	}
}
