package TestNGfiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotation2 {
	@BeforeSuite
	public void installsoftware()
	{
		System.out.println("THIS IS FIRST");
	}
	@Test
	@Parameters({"Username"})
	public void closeapplication(String username)
	{
		System.out.println(username);
		System.out.println("Close the application");
	}
	
	
}
