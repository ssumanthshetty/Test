package TestNGfiles;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	
	
	// WebDriver driver = 
	
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumanth\\Downloads\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
		
	//**@Test 
	public void GmailLogin () throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumanth\\Downloads\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
		driver.get("http://www.gmail.com");
		assertEquals("Sign in",driver.findElement(By.id("signIn")).getAttribute("value"));
		           driver.findElement(By.id("Email")).sendKeys("sshetty0461@gmail.com");
		           driver.findElement(By.id("Passwd")).sendKeys("hello");
		           driver.findElement(By.id("signIn")).click();
		           Thread.sleep(10000);
		           driver.switchTo().frame("canvas_frame");
		           driver.findElement(By.className("gbgs4dn")).click();
		           driver.findElement(By.id("gb_71")).click();
		           driver.switchTo().defaultContent();
		           assertEquals("sign in to Gmail", driver.findElement(By.id("button")).getText());
	}//
	@AfterClass
	 public void teardown() {
		// driver.quit();
		        		   
		           
	}
	

}
