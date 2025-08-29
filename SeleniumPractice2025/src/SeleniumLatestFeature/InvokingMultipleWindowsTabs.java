package SeleniumLatestFeature;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultipleWindowsTabs {

	private static final List<WebElement> WebElement = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\khateeja pasha\\OneDrive\\Documents\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
	Set<String> handles=driver.getWindowHandles();
	Iterator<String> iterator=handles.iterator();
	String parentid=iterator.next();
	String childid=iterator.next();
	driver.switchTo().window(childid);
	driver.get("https://rahulshettyacademy.com");
String courseNme=driver.findElements(By.xpath("//a[contains(@href,'https://courses.rahulshettyacademy.com/p/')]")).get(1).getText();
System.out.println(courseNme);

	
		

	}

}
