package StepDefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import POM.AmazonPOM;
import POM.meeshoPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Meeshostep {
	public WebDriver driver;
	public meeshoPOM MP;
	@Given("Uesr Launch the browser2")
	public void uesr_launch_the_browser2()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Amazon\\WebDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		
	}
	@Given("User enter the url")
	public void user_enter_the_url() {
		driver.get("https://www.meesho.com/");
		MP=new meeshoPOM(driver);
	}

	@When("User click on search box")
	public void user_click_on_search_box() {
		MP.SearchBox.click();
	}

	@When("User Enter smartwatch  in searchbox and click on smartwatch")
	public void user_enter_smartwatch_in_searchbox_and_click_on_smartwatch() {
		MP.SearchBox.sendKeys("sm");
		MP.SmartTextclick.click();
		System.out.println("++++++++"+driver.getTitle()+"++++++++++++++++");
		
		
	}

	@When("User select the smartwatch and click particular smartwatch")
	public void user_select_the_smartwatch_and_click_particular_smartwatch() throws InterruptedException { 
		
		//String handle=driver.getWindowHandle();
		//Set<String> handles=driver.getWindowHandles();
		
		//driver.switchTo().window(handle);
		
		String currentwindow=driver.getWindowHandle();
		System.out.println(currentwindow);
		Set<String> handles=driver.getWindowHandles();
		
		
		for(String actual:handles)
		{
			if(!actual.equalsIgnoreCase(currentwindow))
			{
				driver.switchTo().window(actual);
//				JavascriptExecutor js1=(JavascriptExecutor)driver;
//				js1.executeScript("window.scrollBy(0,350);","");				
				
			}
			
		}
		
		MP.Selectwatch.click();
		Thread.sleep(5000);
		
	}

	@When("User add to cart")
	public void user_add_to_cart() throws InterruptedException {
		System.out.println("*********"+driver.getTitle()+"***********");
		MP.Click_Add_to_Cart.click();
		Thread.sleep(5000);
		System.out.println("*********"+driver.getTitle()+"***********");
		
	}

	@Then("User ask for continue")
	public void user_ask_for_continue() {
		
		Assert.assertEquals("Meesho", driver.getTitle());
		
		
		driver.close();
		driver.quit();
	}


}
