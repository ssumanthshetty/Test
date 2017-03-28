package stepdefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AtitudeTest {
@Given("^I work in ([^\"]*)$")
public void ln(String str) throws Throwable{
	if(str.equals("Late Nights"))
	System.out.println("Test case exceuted");
	else if (str.equals("Mornings"))
		System.out.println("Second test case is executed");
	//throw new PendingException();
}
@When("^I meet ([^\"]*)$ ")
public void meet(String str)throws Throwable{
	if (str.equals("Watchman"))
		System.out.println("Test case exceuted");
	else if (str.equals("Newspaper"))
		System.out.println("Test case exceuted");
	//throw new PendingException();
		
}
@Then("^I ([^\"]*) him$")
public void him(String str) throws Throwable{
	if (str.equals("greet"))
		System.out.println("Test case exceuted");
	else if (str.equals("don't greet"))
		System.out.println("Test case exceuted");
	//throw new PendingException();
		
		
}

}
