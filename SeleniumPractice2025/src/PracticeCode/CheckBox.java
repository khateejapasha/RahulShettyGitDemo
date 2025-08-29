package PracticeCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\khateeja pasha\\OneDrive\\Documents\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_IndArm")).isSelected());
	
		driver.findElement(By.name("ctl00$mainContent$chk_IndArm")).click();
		System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_IndArm")).isSelected());
		Thread.sleep(2000);
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
	}

}
