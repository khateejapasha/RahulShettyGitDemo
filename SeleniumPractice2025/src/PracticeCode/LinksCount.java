package PracticeCode;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\khateeja pasha\\OneDrive\\Documents\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//links always start with tagname a
		System.out.println(driver.findElements(By.tagName("a")).size());
		//footer links count//limiting webdriver scope
		WebElement footerdriver=driver.findElement(By.xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement columndriver=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//click each link and check if pages are opening
		for(int i=1; i<columndriver.findElements(By.tagName("a")).size(); i++)
		{
			String ClickonLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(ClickonLinkTab);
			Thread.sleep(2000);
			
		}
		//Opens all the link tab and fetch Title
		Set<String> windowsid=driver.getWindowHandles();
		Iterator<String> it=windowsid.iterator();
		while(it.hasNext())
		
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}


