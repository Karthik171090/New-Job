package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class w3Schools {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium9.30Batch\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//To find the tables count
//		List<WebElement> listTables = driver.findElements(By.tagName("table"));
//		int size = listTables.size();
//		System.out.println(size);
//		
		WebElement table = driver.findElement(By.id("customers"));
		
		//To print the first row of all values
//		List<WebElement> lstRows = table.findElements(By.tagName("tr"));
//		WebElement element = lstRows.get(0);
//		String text = element.getText();
//		System.out.println(text);
//		
//		//To print the first 2 rows of all values
//		List<WebElement> lstRows = table.findElements(By.tagName("tr"));
//		for (int i = 0; i < 2; i++) {
//			WebElement element = lstRows.get(i);
//			String text = element.getText();
//			System.out.println(text);
		
//		//To print the last 3 rows of all values
//				List<WebElement> lstRows = table.findElements(By.tagName("tr"));
//				for (int i = 4; i < lstRows.size(); i++) {
//					WebElement element = lstRows.get(i);
//					String text = element.getText();
//					System.out.println(text);
//			
//		}
		
//		//To print the last row values when rows changing dynamically
//		List<WebElement> lstRows = table.findElements(By.tagName("tr"));
//		int l = lstRows.size();
//		WebElement lastRow = lstRows.get(l-1);
//		List<WebElement> lstHeading = lastRow.findElements(By.tagName("td"));
//		for (int i = 0; i < lstHeading.size(); i++) {
//			WebElement element = lstHeading.get(i);
//			String text = element.getText();
//			System.out.println(text);
//		}
		
//		//To print the middle row values
//				List<WebElement> lstRows = table.findElements(By.tagName("tr"));
//				int l = lstRows.size();
//				int k=l/2;
//				WebElement lastRow = lstRows.get(k);
//				List<WebElement> lstHeading = lastRow.findElements(By.tagName("td"));
//				for (int i = 0; i < lstHeading.size(); i++) {
//					WebElement element = lstHeading.get(i);
//					String text = element.getText();
//					System.out.println(text);
//				}
//		//To print the alternate row values
//		List<WebElement> lstRows = table.findElements(By.tagName("tr"));
////		int l = lstRows.size();
////		WebElement lastRow = lstRows.get(l);
////		List<WebElement> lstHeading = lastRow.findElements(By.tagName("td"));
//		for (int i = 0; i < lstRows.size(); i++) {
//			if(i % 2 == 1) {
//			WebElement element = lstRows.get(i);
//			String text = element.getText();
//			System.out.println(text);
//			}
//		}
		
//		//To print all values using looping
//				List<WebElement> lstRows = table.findElements(By.tagName("tr"));
//				for (int i = 0; i < lstRows.size(); i++) {
//					WebElement element = lstRows.get(i);
//					String text = element.getText();
//					System.out.println(text);
//					}
		
		//To print all values using enhanced looping
		List<WebElement> lstRows = table.findElements(By.tagName("tr"));
		
	for (WebElement x : lstRows) {
		String text = x.getText();
		System.out.println(text);
		
	}
				
	}
}