package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	@FindBy(xpath = "//input[@placeholder='Select Country']")private WebElement country;
	@FindBy(xpath = "(//span[@class='ng-star-inserted'])[2]")private WebElement ind;
	@FindBy(css = ".action__submit")private WebElement placeOrder;
	
	public Payment(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Indiaa() {
		ind.click();
		
	}
	
	public void CountrySelect()
	{
		country.sendKeys("India");
	}
	public void PlaceOrderbtn() {
		placeOrder.click();
		
	}

}
