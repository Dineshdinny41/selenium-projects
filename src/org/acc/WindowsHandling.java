package org.acc;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement mobiles= driver.findElement(By.linkText("Mobiles"));
        Actions act = new Actions(driver);
        act.contextClick(mobiles).build().perform();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        WebElement sellers= driver.findElement(By.partialLinkText("Sellers"));
        act.contextClick(sellers).build().perform();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        WebElement electronics=  driver.findElement(By.linkText("Customer Service"));
        act.contextClick(electronics).build().perform();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        Set<String> windowhandles = driver.getWindowHandles();
        List<String> li = new ArrayList<String>();
        li.addAll(windowhandles);
        driver.switchTo().window(li.get(1));
        String currenturl = driver.getCurrentUrl();
        System.out.println(currenturl);
        
        
       
       
        
       
	}
}
