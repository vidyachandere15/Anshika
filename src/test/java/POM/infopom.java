package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class infopom {
public WebDriver driver;
	
	public infopom(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="txtSearchComp")
	public WebElement Search;
	
	
	
	@FindBy(xpath="//a[@href='company/INFY']")
	public WebElement Text;
	
	

}


