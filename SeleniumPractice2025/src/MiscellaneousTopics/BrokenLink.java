package MiscellaneousTopics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\khateeja pasha\\OneDrive\\Documents\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links=driver.findElements(By.xpath("//li[@class='gf-li']/a"));
	SoftAssert a=new SoftAssert();
		Thread.sleep(2000);
		for(WebElement link:links) {
			String url=link.getAttribute("href");
			//System.out.println(url);//print list of links
			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode=conn.getResponseCode();
			//System.out.println(respCode);
		
			if(respCode>400)
			{
				System.out.println(link.getText()+respCode);
			}
			
		}

	}

}
