package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPOM{
	public WebDriver driver;
	
	public AmazonPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
@FindBy(xpath="//input[@name='field-keywords']")
public WebElement searchbox;

public void searchclick()
{
searchbox.click();	
}

@FindBy(xpath="//div[@class='nav-search-submit nav-sprite']")
public WebElement search;

public void search()
{
search.click();	
}

@FindBy(xpath="(//img[@class='s-image'])[3]")
public WebElement Tshirt;

public void TshirtClick()
{
Tshirt.click();	
}

@FindBy(xpath="//input[@name='submit.add-to-cart']")
public WebElement AddToCart;

public void CliclAddToCart()
{
	//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddToCart);
	AddToCart.click();
}
}
