package org.test;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium9.30Batch\\driver1\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.flipkart.com/");
		LibGlobal global= new LibGlobal();
		WebDriver driver = global.getDriver();
		global.loadUrl(driver, "https://www.flipkart.com/");
//		WebElement btnLogin = driver.findElement(By.xpath("//a[@class='_3Ep39l']"));
//		btnLogin.click();
//		WebElement txtUser = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
//		txtUser.sendKeys("Karthik");
//		WebElement txtPass = driver.findElement(By.xpath("//input[@type='password']"));
//		txtPass.sendKeys("1234567");
//		String user = txtUser.getAttribute("value");
//		System.out.println(user);
//		String pass = txtPass.getAttribute("value");
//		System.out.println(pass);
		
		if(driver.findElements(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).size() != 0){
			WebElement btnCross = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
			btnCross.click();
			WebElement txtSearch = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
			txtSearch.click();
			txtSearch.sendKeys("Dell", Keys.ENTER);
			}
		else
		{
			WebElement txtSearch = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
			txtSearch.click();
			txtSearch.sendKeys("Dell");
			txtSearch.sendKeys(Keys.ENTER);
			}
		}
	}
