package TestngDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidertest {
@Test
public void test()
{
	System.out.println("1st test");
}
@Test(dataProvider = "getdata")
public void second(String firstname,String password)
{
	System.out.println("second test");
	System.out.println(firstname);
	System.out.println(password);
}
@Test
public void third()
{
	System.out.println("third test");
}
@DataProvider
@Test
public Object[][] getdata()
{
	Object[][] ob= new Object[3][2];
	//1st data
	ob[0][0]="firstname";
	ob[0][1]="password";
	//2nd data
	ob[1][0]="secondUname";
	ob[1][1]="secondpwd";
	//3rd data
	ob[2][0]="thirdUname";
	ob[2][1]="thirdpwd";
	return ob;
	
}
}
