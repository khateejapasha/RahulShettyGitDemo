package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassLandingPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		LandingPage land=new LandingPage(driver);
		land.loginmethod();
		land.cliclogin();
		Thread.sleep(2000);
		
		ForgotAccount forgot1=new ForgotAccount(driver);
		forgot1.forgot();
	Thread.sleep(2000);
	
	FindAccount find1=new FindAccount(driver);
	find1.enteremail();
	find1.Search();
	
	
	}

}
