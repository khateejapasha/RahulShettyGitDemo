package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	@FindBy(xpath = "//li[@class='items even ng-star-inserted']")private WebElement productlist;
	@FindBy(xpath = "(//button[@class='btn btn-primary'])[3]")private WebElement checkout;
	
	public Cart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Lists()
	{
		System.out.println(productlist.getText());
		
	}
	public void Checkoutbtn()
	{
		checkout.click();
	}

}
