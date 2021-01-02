package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium9.30Batch\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//		WebElement txtUser = driver.findElement(By.id("email"));
//		txtUser.sendKeys("Karthik S");
//		String attr1 = txtUser.getAttribute("value");
//		System.out.println(attr1);
//		WebElement txtPswd = driver.findElement(By.id("pass"));
//		txtPswd.sendKeys("killer");
//		String attr2 = txtPswd.getAttribute("value");
//		System.out.println(attr2);
		WebElement btnCreateNewAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btnCreateNewAcc.click();
		Thread.sleep(1000);
//		WebElement dDnYear = driver.findElement(By.name("birthday_year"));
//		Select select = new Select (dDnYear);
//		List<WebElement> allOptions = select.getOptions();
//		for (WebElement X : allOptions) {
//		String s = X.getText();
//		System.out.println(s);
//		}
//		WebElement dDnDay = driver.findElement(By.name("birthday_day"));
//		Select s = new Select (dDnDay);
//		List<WebElement> list = s.getOptions();
//		for (WebElement W : list) {
//		String s1 = W.getAttribute("value");
//		System.out.println(s1);
//		}
//		WebElement dDnMonth = driver.findElement(By.name("birthday_month"));
//		Select select = new Select (dDnMonth);
//		List<WebElement> allOptions = select.getOptions();
//		for (int i = 8; i < allOptions.size(); i++) {
//		WebElement W = allOptions.get(i);
//		String s = W.getText();
//		System.out.println(s);
//		}
//		WebElement dDnMonth = driver.findElement(By.name("birthday_month"));
//		Select select = new Select (dDnMonth);
//		List<WebElement> allOptions = select.getOptions();
//		for (int i = 0; i <= 4; i++) {
//		WebElement W = allOptions.get(i);
//		String s = W.getText();
//		System.out.println(s);
//		}
//		WebElement dDnMonth = driver.findElement(By.name("birthday_month"));
//		Select select = new Select (dDnMonth);
//		select.selectByIndex(5);
//		List<WebElement> l = select.getOptions();
//		WebElement e = l.get(5);
//		String s = e.getText();
//		System.out.println(s);
		
//		WebElement dDnMonth = driver.findElement(By.name("birthday_month"));
//		Select select = new Select (dDnMonth);
//		List<WebElement> options = select.getOptions();
//		for (int i = 0; i < options.size(); i++) {
//			if (i % 2 ==1) {
//			WebElement w = options.get(i);
//			String text = w.getText();
//			System.out.println(text);
//				}	
//		}
		WebElement dDnDay = driver.findElement(By.name("birthday_day"));
		String text = dDnDay.getText();
		System.out.println(text);		
		WebElement dDnMonth = driver.findElement(By.name("birthday_month"));
		String text1 = dDnMonth.getText();
		System.out.println(text1);
		WebElement dDnYear = driver.findElement(By.name("birthday_year"));
		String text2 = dDnYear.getText();
		System.out.println(text2);
		
		}
	}
	

	
	
	
	
	
