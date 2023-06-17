package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class meeshoPOM {
public WebDriver driver;
	
	public meeshoPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	 public WebElement SearchBox;
	
	
	@FindBy(xpath="(//p[contains(text(),'smartwatch')])[1]")
	 public WebElement SmartTextclick;
	
	
	@FindBy(xpath="//img[@src='https://images.meesho.com/images/products/194347895/f5oz9_400.jpg']")
	public WebElement  Selectwatch;
	
	
	@FindBy(xpath="//span[contains(text(),'Add to Cart')]")
	public WebElement Click_Add_to_Cart;
	

}
