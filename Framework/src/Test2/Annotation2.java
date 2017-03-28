package Test2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Annotation2 {
	@BeforeSuite
	public void installsoftware()
	{
		System.out.println("THIS IS FIRST");
	}
	@AfterSuite
	public void closeapplication()
	{
		System.out.println("Close the application");
	}
	
	
}
