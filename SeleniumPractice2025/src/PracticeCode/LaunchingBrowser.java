package PracticeCode;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\khateeja pasha\\OneDrive\\Documents\\chromedriver-win64\\chromedriver-win64");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
	}

}
