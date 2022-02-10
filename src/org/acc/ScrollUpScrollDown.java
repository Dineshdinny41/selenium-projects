package org.acc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpScrollDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProjects\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.decathlon.in/");
		driver.manage().window().maximize();
		WebElement close=driver.findElement(By.xpath("//div[@class='btn-close']"));
		close.click();
		WebElement down = driver.findElement(By.xpath("//div[@class='_2_-K_WGKkJ d-none d-md-flex']"));
	    WebElement starting =driver.findElement(By.xpath("//span[@class='Ly7NR05LOA']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", down);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", starting);
		driver.get("https://www.album.alexflueras.ro/");
		driver.manage().window().maximize();
		WebElement pic1= driver.findElement(By.id("a3"));
		WebElement pic2= driver.findElement(By.id("a9"));
		js.executeScript("arguments[0].scrollIntoView();", pic2);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", pic1);
		 

	}

}
