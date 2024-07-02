package Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ContactSteps {
	WebDriver driver;
	
	@Given("user should open chrome browser and enter url")
	public void user_should_open_chrome_browser_and_enter_url() {
	    // Write code here that turns the phrase above into concrete actions
		
	    driver = new ChromeDriver();
//		
//		driver.get("https://www.sparshhospital.com/contact-us/");
//		driver.manage().window().maximize();
	    
	}

	@When("navigate to url of sparsh hospital")
	public void navigate_to_url_of_sparsh_hospital() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.sparshhospital.com/contact-us/");
		driver.manage().window().maximize();
	}

	@When("user enter firstname, lastname, phone no, email address, search hospital, type of enquiry")
	public void user_enter_firstname_lastname_phone_no_email_address_search_hospital_type_of_enquiry() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	   driver.findElement(By.id("contact_first_name")).sendKeys("virat");
	   driver.findElement(By.id("contact_last_name")).sendKeys("kohli");
	   Thread.sleep(2000);
	   driver.findElement(By.id("contact_phone")).sendKeys("7620001111");
	   driver.findElement(By.id("contact_email")).sendKeys("virat@gmail.com");
	   Thread.sleep(2000);
	   Select objSelect = new Select(driver.findElement(By.id("contact_hospital")));
	   objSelect.selectByValue("SPARSH Hospital, Hassan");
	   Thread.sleep(2000);
	   Select objSelect1 = new Select(driver.findElement(By.id("contact_enquiry_type")));
	   objSelect1.selectByValue("General Enquiry");
	   Thread.sleep(2000);
	   driver.findElement(By.id("contact_message")).sendKeys("Hello");
	   driver.findElement(By.id("contact_submit")).click();
	   
	}

	@When("click on send")
	public void click_on_send() {
	    // Write code here that turns the phrase above into concrete actions
		
		 
	}

@When("user enter {string}, {string}, {string}, {string}")
public void user_enter(String firstname , String lastname, String phoneno, String emaiaddress ) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.id("contact_first_name")).sendKeys(firstname);
	   driver.findElement(By.id("contact_last_name")).sendKeys(lastname);
	   driver.findElement(By.id("contact_phone")).sendKeys(phoneno);
	   driver.findElement(By.id("contact_email")).sendKeys(emaiaddress);
	   
	   Select objSelect = new Select(driver.findElement(By.id("contact_hospital")));
	   objSelect.selectByValue("SPARSH Hospital, Hassan");
	   Thread.sleep(2000);
	   Select objSelect1 = new Select(driver.findElement(By.id("contact_enquiry_type")));
	   objSelect1.selectByValue("General Enquiry");
	   Thread.sleep(2000);
	   driver.findElement(By.id("contact_message")).sendKeys("Hello");
	   driver.findElement(By.id("contact_submit")).click();
    
}

	@Then("getting thank you message.")
	public void getting_thank_you_message() {
	    // Write code here that turns the phrase above into concrete actions
//		  String action = driver.getTitle();
//		  System.out.println(action);
//		  String ex= "Thank you";
//		  Assert.assertEquals(action, ex);
	  driver.close();
	  
	}

	

}
