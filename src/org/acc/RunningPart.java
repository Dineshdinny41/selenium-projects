package org.acc;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RunningPart extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException, IOException {
	 launchbrowser("chrome");
		geturl("http://automationpractice.com/index.php");
		WebElement sign=driver.findElement(By.xpath("//a[@class='login']"));
		signin(sign);
		WebElement mailid = driver.findElement(By.id("email"));
		signup(mailid,"mail","dineshdinny97@gmail.com");
		WebElement pass = driver.findElement(By.id("passwd"));
		signup(pass, "password", "sathish@1");
		WebElement signu = driver.findElement(By.id("SubmitLogin"));
		click(signu);
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		action(women, "move");
		WebElement casual = driver.findElement(By.xpath("//a[@title='Evening Dresses']"));
		action(casual, "click");
		WebElement radio = driver.findElement(By.id("layered_id_attribute_group_2"));
		action(radio, "radio");
		WebElement name= driver.findElement(By.xpath("//div[@class='rte']"));
		scroll(name,"down");
		WebElement name2= driver.findElement(By.xpath("(//div[@class='product-count'])[2]"));
		scroll(name2, "up");
		WebElement select = driver.findElement(By.id("selectProductSort"));
		dropdown(select, "index", "4");
		WebElement cart = driver.findElement(By.xpath("//a[contains(@class,'ajax_add_to_cart_button ')]"));
		procced(cart, "click");
		WebElement prcd = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		procced(prcd, "click1");
		WebElement next = driver.findElement(By.xpath("(//i[@class=\"icon-chevron-right right\"])[3]"));
		procced(next, "click2");
		WebElement next1= driver.findElement(By.name("processAddress"));
		procced(next1, "click3");
		WebElement box= driver.findElement(By.id("cgv"));
		procced(box, "click4");
		WebElement last = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		procced(last, "click5");
		WebElement payment= driver.findElement(By.xpath("//a[@title='Pay by check.']"));
		procced(payment, "click6");
		WebElement finalpay = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		procced(finalpay, "click7");
		Thread.sleep(2000);
		Screenshot();
		gettext();
		Screenshot();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
