package org.acc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		List<WebElement>alldata=driver.findElements(By.xpath("//table/tbody/tr/td"));
		 for (WebElement data : alldata) {
			 String text = data.getText();
			 System.out.println(text);
			
		}
		 System.out.println("*** particular data ***");
		 WebElement particulardata=driver.findElement(By.xpath("//table/tbody/tr[9]/td[5]"));
		 String text = particulardata.getText();
		 System.out.println(text);
	}
	}