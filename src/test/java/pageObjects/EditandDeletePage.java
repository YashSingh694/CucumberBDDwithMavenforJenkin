package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditandDeletePage {
	
	public WebDriver ldriver;
	
	public EditandDeletePage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath = "//a[@class='btn btn-default']")
	@CacheLookup
	WebElement clkEditBtn;
	
	@FindBy(xpath = "//button[@name='save']")
	@CacheLookup
	WebElement saveBtn;
	
	
	public void clkEditBTn()
	{
		clkEditBtn.click();
	}

}
