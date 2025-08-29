package TestngDemo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CarDemo {

	@Test
		public void CarLoanDemo()
	{
		System.out.println("Carloan1");
		//System.out.println(urlname);
	}
	@Test(groups = {"Smoke"})
	public void CarLoanMobile()
	{
		System.out.println("CarLoanMobile");
	}

	@Test
	@Parameters("URL")
	public void CarLaonLogin( String url)
	{
		System.out.println("CarLaonLogin");
	
		System.out.println(url);
		
	}

}
