package PracticeCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelectClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\khateeja pasha\\OneDrive\\Documents\\chromedriver-win64\\chromedriver-win64");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement path = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select sel=new Select(path);
		//select by index
		sel.selectByIndex(3);
		System.out.println(sel.getFirstSelectedOption());
		//select by value
		sel.selectByValue("INR");
		System.out.println(sel.getFirstSelectedOption());
		//select by visibletext
		sel.selectByVisibleText("AED");
		System.out.println(sel.getFirstSelectedOption());
		

	}

}
