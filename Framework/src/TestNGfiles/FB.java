package TestNGfiles;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {

	

public static void facebook(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumanth\\Downloads\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("abhi.santhu25@gmail.com");
	driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("1234");
	driver.findElement(By.xpath(".//*[@id='u_0_u']")).click();
}
}
