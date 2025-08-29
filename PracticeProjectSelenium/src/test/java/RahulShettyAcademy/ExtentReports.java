package RahulShettyAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReports {
	com.aventstack.extentreports.ExtentReports extent;

	@BeforeTest
	public void Config()
	{
		String path=System.getProperty("user.dir")+"\\reports\\report.html";
		ExtentSparkReporter report=new ExtentSparkReporter(path);
		report.config().setReportName("Web Automation Result");
		report.config().setDocumentTitle("Test Results");
		

 extent=new com.aventstack.extentreports.ExtentReports();
extent.attachReporter(report);
extent.setSystemInfo("Tester", "Khateeja pasha");
	
		
	}
	@Test
	public void initialDemo()
	{
		ExtentTest test=extent.createTest("Initial Demo");
		
		
	System.setProperty("webdriver.chrome.drive", "C:\\Users\\khateeja pasha\\OneDrive\\Documents\\chromedriver-win64\\chromedriver-win64");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com");
	System.out.println(driver.getTitle());
	driver.close();
	test.fail("Result do not match");
	extent.flush();
	
	}

}
