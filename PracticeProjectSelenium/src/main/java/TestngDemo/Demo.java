package TestngDemo;


import java.io.File;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;
	@Test(groups = {"Smoke"})
	public void TestDemo()
	{
		System.out.println("Hello testng");
		
	}

}
