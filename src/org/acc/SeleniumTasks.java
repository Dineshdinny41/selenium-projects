package org.acc;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTasks {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProjects\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	driver.navigate().to("https://www.instagram.com/?hl=en");
	Thread.sleep(3000);
	WebElement email = driver.findElement(By.xpath("//input[@autocapitalize='off']"));
    email.sendKeys("dineshmanoharan97@gmail.com");
	WebElement pas = driver.findElement(By.xpath("//input[@name='password']"));
	pas.sendKeys("577849345");
	WebElement log = driver.findElement(By.xpath("//div[contains(@class,'Igw0E')]"));
	log.click();
	Thread.sleep(2000);
	String title = driver.getTitle();
	System.out.println(title);
	String currentur = driver.getCurrentUrl();
	System.out.println(currentur);
	Thread.sleep(2000);
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumProjects\\screenshot\\pictures3.png");
	FileUtils.copyFile(src, dest);
	//driver.navigate().back();//
	//driver.navigate().refresh();//
	
}
}
