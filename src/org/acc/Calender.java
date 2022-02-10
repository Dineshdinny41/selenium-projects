package org.acc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		WebElement calender=driver.findElement(By.id("datepicker"));
		calender.click();
		WebElement text=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		String title = text.getText();
		System.out.println(title);
		String[] arr=title.split(" ");
		String month=arr[0];
		String year =arr[1];
		System.out.println(month);
		System.out.println(year);
		while(!(month.equals("September")&& year.equals("2022"))) {
			WebElement nxtbtn=	driver.findElement(By.xpath("//span[text()='Next']"));
			nxtbtn.click();
			text=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			title = text.getText();
			System.out.println(title);
			arr=title.split(" ");
			month=arr[0];
			year =arr[1];


		}
	WebElement date=	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]/a"));
	date.click();
	}
}