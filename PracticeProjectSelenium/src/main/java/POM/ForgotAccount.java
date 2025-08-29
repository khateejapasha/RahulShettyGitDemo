package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotAccount {
	@FindBy(xpath = "//a[@class='_97w4']")private WebElement forgotacc;

	public ForgotAccount(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void forgot()
	{
		forgotacc.click();
	}

}
