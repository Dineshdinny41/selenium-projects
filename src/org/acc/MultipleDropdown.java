package org.acc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class MultipleDropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProjects\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		driver.manage().window().maximize();
		WebElement drop= driver.findElement(By.xpath("//select[@multiple='multiple']"));
		Select s = new Select(drop);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		List<WebElement> options=s.getOptions();
		for(WebElement opt : options) {
			String text = opt.getText();
			System.out.println(text);
		}
		s.selectByIndex(3);
		s.selectByValue("msmanual");
		s.selectByVisibleText("Performance Testing");
		// s.deselectAll();
		System.out.println("*****ALL SELECTED OPTIONS*****");
		 List<WebElement> selectedopt = s.getAllSelectedOptions();
		 for(WebElement allsel :selectedopt) {
			 String text1 = allsel.getText();
			 System.out.println(text1);
			 
		 }
		 System.out.println("*****FIRST SELECTED OPTION*****");
		WebElement firstselected = s.getFirstSelectedOption();
		String Text3 = firstselected.getText();
		System.out.println(Text3);
		
	}

}
