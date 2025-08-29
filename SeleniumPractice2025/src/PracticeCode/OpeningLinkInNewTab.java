package PracticeCode;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningLinkInNewTab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\khateeja pasha\\OneDrive\\Documents\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement linksdriver=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		for(int i=1;i<driver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			linksdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(2000);
		}//opens all the tabs
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		Thread.sleep(2000);
		while (it.hasNext()) 
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
			
		}
		
		
	}

}
