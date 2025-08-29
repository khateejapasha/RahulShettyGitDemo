package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	@FindBy(id="email")private WebElement emailID;
	@FindBy(id="pass") private WebElement password;
	@FindBy(id="loginbutton")private WebElement button;
	
	// initialization
	
	public LandingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	
	public void loginmethod()
	{
		emailID.sendKeys("Khateejapasha11@gmail.com");
		password.sendKeys("Zoya@1000");
	}
	public void cliclogin()
	{
		button.click();
	}

}
