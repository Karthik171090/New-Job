package org.broken;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkAndImage {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium9.30Batch\\driver1\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.target.com/");
	List<WebElement> links = driver.findElements(By.tagName("img"));
	int size = links.size();
	int count=0;
	System.out.println(size);
	for (int i = 0; i < links.size(); i++) {
		String linkName = links.get(i).getAttribute("src");
		if(!(linkName==null)){
		URL url=new URL(linkName);
		URLConnection openConnection = url.openConnection();
		HttpURLConnection connection=(HttpURLConnection) openConnection;
		int responseCode = connection.getResponseCode();
		if(!(responseCode==200)) {
			count++;
			System.out.println(linkName);
		
		}
		}
		
	}
	System.out.println("Broken link count is" +count);
}
	
}
