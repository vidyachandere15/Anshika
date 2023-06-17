package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.AmazonPOM;
import POM.infopom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class stepinfo {
	public WebDriver driver;
	public infopom ip;
	
	@Given("Launch the browser1")
	public void launch_the_browser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    ip=new infopom(driver);
		
	}
	@Given("Enter a URL")
	public void enter_a_url() {
		driver.get("https://ticker.finology.in/");
	}
	@When("write text infosys Ltd in  a search box")
	public void write_text_infosys_ltd_in_a_search_box() {
		ip.Search.sendKeys("Inf");
		
		
		
	}
	
	
	@When("click on infosys Ltd")
	public void click_on_infosys_ltd() {
		ip.Text.click();
	}
	
	

	@Then("Navigate next page")
	public void navigate_next_page() {
		System.out.println(driver.getTitle());
		Assert.assertEquals( "Infosys Share Price, Financials and Stock Analysis",driver.getTitle());
		
		
	driver.close();
	}
	
	




}
