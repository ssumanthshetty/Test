package Datadriven;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Annotations {
 
	@AfterMethod
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
	  }
	@Test(dataProvider="getData")
	 public void OpeningBrowser(String username, String collegename )
	{
		System.out.println("Test Case 2");
		System.out.println("username");
		System.out.println("collegename");
		
	}
	//@Test
	 public void TicketBooking()
	 {
		System.out.println("Test Case 1");
	 }


@DataProvider
 public Object[][] getData ()
{ 
	// i stands for number of times need to run
	// j stands for number of parametes to be passed
	Object[][] data = new Object[2][2];
	data[0][0]="sumanth";
	data[0][1]="ucm";
	
	data[1][0]="akshay";
	data[1][1]="snhu";
	return data;
	}
}

