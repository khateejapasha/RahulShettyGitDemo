package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindAccount {
	@FindBy(id="identify_email")private WebElement find;
	@FindBy(id="did_submit")private WebElement submit;
	public FindAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	} 
	
	public void enteremail()
	{
		find.sendKeys("Khateejapasha11@gmail.com");
	}
	public void Search()
	{
		submit.click();
	}

}
