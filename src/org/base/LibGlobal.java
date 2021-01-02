package org.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LibGlobal {

	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium9.30Batch\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
		}
	public void loadUrl(WebDriver driver, String url) {
		driver.get(url);
		}
	public void findelementId(WebDriver driver, String id) {
		driver.findElement(By.id(id));
	
	}
	public void findelementName(WebDriver driver, String name) {
		driver.findElement(By.name(name));
	}
	public void findelementClassName(WebDriver driver, String classname) {
		driver.findElement(By.className(classname));
	}
	public void findelementXpath(WebDriver driver, String xpath) {
		driver.findElement(By.xpath(xpath));
	}
	
	public void type(WebElement element, String data) {
		element.sendKeys(data);
		}
	public void btnClick(WebElement element) {
		element.click();
	}
	public void quitBrowser(WebDriver driver) {
		driver.quit();
	}
	public void close(WebDriver driver) {
		driver.close();
	}
	public void getTitle(WebDriver driver) {
		driver.getTitle();
	}
	public void getCurrent(WebDriver driver) {
		driver.getCurrentUrl();
	}
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void navigateTo(WebDriver driver, String url) {
		driver.navigate().to(url);
	}
	public void navigateBack(WebDriver driver) {
		driver.navigate().back();
	}
	public void navigateForward(WebDriver driver) {
		driver.navigate().forward();
	}
	public void navigateRefresh(WebDriver driver) {
		driver.navigate().refresh();
	}
	public void isDisplayed(WebElement element) {
		element.isDisplayed();
	}
	public void isSelected(WebElement element) {
		element.isSelected();
	}
	public void isEnabled(WebElement element) {
		element.isEnabled();
	}
	
	public void moveToElement(Actions action, WebElement element) {
		action.moveToElement(element).perform();
	}
	public void dragAndDrop(Actions action, WebElement element, WebElement element1) {
		action.dragAndDrop(element, element1).perform();
	}
	public void contextClick(Actions action, WebElement element) {
		action.contextClick(element).perform();
	}
	public void doubleClick(Actions action, WebElement element) {
		action.doubleClick(element).perform();
	}
	public void switchToFrame(WebDriver driver, int id) {
		driver.switchTo().frame(id);
	}
	public void switchToFrameName(WebDriver driver, String name) {
		driver.switchTo().frame(name);
	}

	public void getText(WebElement element) {
		element.getText();
	}
	public void getAttribute(WebElement element, String text) {
		element.getAttribute(text);
	}
	public void clear(WebElement element) {
		element.clear();
	}
	
	public void getWindowHandle(WebDriver driver) {
		driver.getWindowHandle();
	}
	public void alertDismiss(WebDriver driver) {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}
	public void alertAccept(WebDriver driver) {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
	
	
}
