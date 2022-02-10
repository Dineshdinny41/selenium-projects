package org.acc;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Alerts {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProjects\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement account = driver.findElement(By.xpath("//a[contains(@class,'_6lti ')]"));
	account.click();
	Thread.sleep(2000);
	WebElement name = driver.findElement(By.name("firstname"));
	name.sendKeys("dinesh");
	WebElement surname = driver.findElement(By.name("lastname"));
	surname.sendKeys("manoharan");
	Thread.sleep(2000);
	WebElement mobile= driver.findElement(By.name("reg_email__"));
	mobile.sendKeys("8072018953");
	Thread.sleep(2000);
	WebElement pass = driver.findElement(By.id("password_step_input"));
	pass.sendKeys("Dinesh@12324");
	WebElement day = driver.findElement(By.id("day"));
	Select s = new Select(day);
	s.selectByValue("20");
	Thread.sleep(2000);
	WebElement month = driver.findElement(By.id("month"));
	Select s1 =new Select(month);
	//s.selectByVisibleText("Jul");
	s1.selectByIndex(1);
	Thread.sleep(2000);
	WebElement year = driver.findElement(By.id("year"));
	Select s2 = new Select(year);
	s2.selectByValue("2014");
	Thread.sleep(2000);
	WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
	gender.click();
	Thread.sleep(2000);
	WebElement custom = driver.findElement(By.xpath("//label[text()='Custom']"));
	custom.click();
	Thread.sleep(2000);
	WebElement pronoun = driver.findElement(By.xpath("//select[contains(@aria-label,'your ')]"));
	pronoun.click();
	Select s3= new Select(pronoun);
	s3.selectByValue("2");
	String title = driver.getTitle();
	System.out.println(title);
	String currenurl = driver.getCurrentUrl();
	System.out.println(currenurl);
	driver.close();
	
	
	
}
}
