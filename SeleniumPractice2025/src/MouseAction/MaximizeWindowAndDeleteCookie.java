package MouseAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindowAndDeleteCookie {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\khateeja pasha\\OneDrive\\Documents\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();//delete all cookie
	//	driver.manage().deleteCookieNamed("asdf");//delete perticular cookie which name given
		
		driver.get("http://google.com");
		

	}

}
