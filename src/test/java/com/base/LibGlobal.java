package com.base;

import java.awt.Robot;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


public class LibGlobal {
	public static WebDriver driver;
	public static Actions a;
	public static Select s ;
	public static Robot r;
	public static JavascriptExecutor jk;
	public static final String AUTOMATE_USERNAME = "divyakrishnamoor1";
	  public static final String AUTOMATE_ACCESS_KEY = "pYotRbNen5kqByMm9pNQ";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	public static WebDriver getDriverCloud() throws MalformedURLException {
		if(driver==null) {
		
		 DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("os_version", "10");
		    caps.setCapability("resolution", "1920x1080");
		    caps.setCapability("browser", "Chrome");
		    caps.setCapability("browser_version", "86.0 beta");
		    caps.setCapability("os", "Windows");    
		    driver = new RemoteWebDriver(new URL(URL), caps);
	}
		return driver;
	}
	public static WebDriver getDriver() {
		if(driver==null) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIVAKAR\\eclipse-workspace\\CucumberProject\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		}
		return driver;
	
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void fill(WebElement e,String s) {
		e.sendKeys(s);
	}
	public static void pageUrl(){
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
	
	
	public static void btnclk(WebElement e) {
		e.click();
	}

	public static void maxWindow(){
		driver.manage().window().maximize();
	}
	public static void select1(WebElement e,String txt) {
		s=new Select(e);
		s.selectByVisibleText(txt);
	}
	public static void sleep() throws InterruptedException {
		Thread.sleep(2000);
	}
	public static void closeBrowser() {
		driver.quit();		
	}

}
