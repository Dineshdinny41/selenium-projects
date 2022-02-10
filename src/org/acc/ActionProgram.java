package org.acc;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionProgram {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProjects\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement close =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		Actions act = new Actions(driver);
		act.click(close).build().perform();
		WebElement fashion = driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[4]"));
		act.moveToElement(fashion).build().perform();
		Thread.sleep(2000);
		WebElement watches = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", watches);
		act.moveToElement(watches).build().perform();
		WebElement click = driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[4]"));
		act.contextClick(click).build().perform();
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		
	}

}
