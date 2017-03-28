package TestNGfiles;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public WebDriver driver;
    @Test 
    public void gmail(){
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumanth\\Downloads\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
    	driver = new ChromeDriver();
    }
}
