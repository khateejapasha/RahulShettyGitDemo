package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(id = "userEmail")private WebElement email;
	@FindBy(id = "userPassword")private WebElement pwd;
	@FindBy(id="login") private WebElement loginbtn;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void senddata()
	{
		email.sendKeys("Khateejapasha11@gmail.com");
		pwd.sendKeys("ZoyaMajid@100");
	}
	
	public void ClickLoginbtn()
	{
		loginbtn.click();
	}

}
