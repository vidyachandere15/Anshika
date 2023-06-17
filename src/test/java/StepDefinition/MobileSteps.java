package StepDefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.MobilePOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MobileSteps {
	MobilePOM mp;
	WebDriver driver;
	@Given("User launch the browser")
	public void user_launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Amazon\\WebDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	}

	@When("User enter the url1")
	public void user_enter_the_url1() {
		driver.get("https://www.amazon.in/");
		mp=new MobilePOM(driver);
	}

	@When("User Click on Mobile Modules")
	public void user_click_on_mobile_modules() {
		mp.Mobiles.click();
	}

	@When("User click on Mobile options")
	public void user_click_on_mobile_options() {
	mp.Mobileoption.click();
	}
	
	@When("choose {string}")
	public void choose(String Mobile) {
		mp.getMobileName(Mobile);
		
		 mp.MobileSearch.sendKeys(Keys.ENTER);
		 
		 
	}
	@When("User Click on {string} mobile")
	public void user_click_on_mobile(String Mobile1) {
		
	
		mp.Mobile_click(Mobile1);
	
		
	}

		

	@Then("User See That Mobile in Add to cart")
    public void user_see_that_mobile_in_add_to_cart() throws InterruptedException {
		String currentwindow=driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
				
		for(String actual:handles)
		{
			if(!actual.equalsIgnoreCase(currentwindow))
			{
				driver.switchTo().window(actual);
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView(true);",mp.Add_to_cart);
				Thread.sleep(5000);
		        mp.Add_to_cart.click();
				
			}
			
		}

		
//		  mp.Add_to_cart.click();
		driver.close();
		driver.quit();
		
	}
	
	

}
