package TestNGfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Annotations {
	
	public WebDriver driver=null;
 
	/*@AfterMethod
	public void ReportGeneration()
	{
		System.out.println("This block executes after all test cases executed");
	}
	
	@BeforeMethod
	  public void UserIdGeneration()
	  {
		System.out.println("This block executes before all test cases executed");
	  }
	@BeforeTest
	 public void Cookies()
	 {
		System.out.println("Delete the cookies");
	 }
	@AfterTest
	  public void CookiesAtClose()
	  {
		System.out.println("Delete the cookies at before close");
	  }*/
	@Test
             
	 public void OpeningBrowser() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("G:\\Udemy\\Framework\\src\\TestNGfiles\\datadriven.properties");
		prop.load(fis);
		//System.out.println(prop.getProperty("username"));
		if(prop.getProperty("browser").equals("chrome"))
{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumanth\\Downloads\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
			 driver =new ChromeDriver();
			 driver.get(prop.getProperty("url"));
		        driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(prop.getProperty("username"));
		        driver.findElement(By.xpath("//*[@id='next']")).click();
		        WebDriverWait wait = new WebDriverWait(driver, 10);
		        WebElement element = wait.until(
		                   ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));
		        driver.findElement(By.id("Passwd")).sendKeys(prop.getProperty("password"));
		        driver.findElement(By.xpath("//*[@id='signIn']")).click();
			
		}
		else if (prop.getProperty("browser").equals("firefox")){
			 driver =new FirefoxDriver();
		}
		driver.get(prop.getProperty("https://www.gmail.com"));
		
	}
	@Test
	
	 public void TicketBooking()
	 {
		System.out.println("Test Case 1 passed successfully");
	 }
}
