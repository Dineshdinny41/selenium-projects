package org.acc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProjects\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		WebElement single = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(single);
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("Dinesh");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		WebElement btn = driver.findElement(By.xpath("//a[@href='#Multiple']"));
		btn.click();
		WebElement outer =driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outer);
		WebElement inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(inner);
		WebElement txt = driver.findElement(By.xpath("//input[@type='text']"));
		txt.sendKeys("dinesh manoharan");
		
		
	}

}
