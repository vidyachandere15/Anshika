package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePOM {
public WebDriver driver;
	
	public MobilePOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Mobiles']")
	public WebElement  Mobiles;
	
	@FindBy(xpath="//span[contains(text(),'Smartphones & Basic Mobiles')]")
	public WebElement Mobileoption;
	
	@FindBy(xpath="//span[contains(text(),'Samsung Galaxy M53 5G (E')]")
	public WebElement Samsung;
		
	@FindBy(xpath="(//span[contains(text(),'Redmi A1 (Light Blue, 2GB RAM, 32GB Storage) | Segment Best AI Dual Cam | 5000mAh Battery | Leather Texture Design | Android 12')])[1]")
	public WebElement Redmi1;
	
	@FindBy(xpath="//span[contains(text(),'Oppo A')]")
	public WebElement Oppo;
	
	public void oppoclick()
	{
		Oppo.click();
	}

	
	@FindBy(id="add-to-cart-button")
	public WebElement Add_to_cart;
	
	@FindBy(id="twotabsearchtextbox")
	public WebElement MobileSearch;
	
	public void getMobileName(String Mobile)
	{
		
	
		MobileSearch.sendKeys(Mobile);
		//MobileSearch.click();
		
	}
	
	public void Mobile_click(String Mobile1)
	{
	
		if(Mobile1.contains("Samsung"))
		{
			Samsung.click();
		}
		else
		{
			Redmi1.click();
		}
		
	}
	
	@FindBy(xpath="//span[contains(text(),'Redmi 10A Sport')]")
	public WebElement Redmi;
	
	
	

}
